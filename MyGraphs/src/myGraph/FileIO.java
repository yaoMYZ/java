/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myGraph;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class FileIO {

    private final Graphs g;

    public FileIO(Graphs G) {
        this.g = G;
    }

    public void saveToFile() throws FileNotFoundException, IOException {
        //get filePath through filechooser
        File file=getSaveFile();
        String filePath=file.getPath();
        
        DataOutputStream foutDataOutputStream = new DataOutputStream(new FileOutputStream(filePath));
        int len = g.xx.size();
        for (int i = 0; i < len; i++) {
            byte[] str = ("#" + g.xx.get(i).toShortString()).getBytes("UTF-8");
            foutDataOutputStream.write(str);
        }
        foutDataOutputStream.close();
    }

    public void saveFile() throws IOException{
        //get filePath through filechooser
        File file=getSaveFile();
        String filePath=file.getPath();
        
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(filePath));
        outputStream.writeObject(g.xx);
    }
    /**
     *
     * @return @throws FileNotFoundException
     * @throws IOException
     */
    public Vector<MyShape> loadToFile() throws FileNotFoundException, IOException, Exception {
        //get file through fileChooser
        File file=getOpenFile();
        String filePath=file.getPath();
        
        Vector<MyShape> ms = new Vector<MyShape>();
        DataInputStream finDataInputStream = new DataInputStream(new FileInputStream(filePath));
        //获取可读入字节数
        int len = finDataInputStream.available();
        byte[] byteStr = new byte[len];
        //从文件中读入字节
        finDataInputStream.read(byteStr);
        String allString = new String(byteStr, "UTF-8");
        //分割字符串
        StringTokenizer stk = new StringTokenizer(allString, "#");
        //为switch语句创建hashmap
        String signalString[] = {"C", "T", "S", "L", "Tr"};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int reg = 0;
        for (String tempsStirng : signalString) {
            hm.put(tempsStirng, reg++);
        }
        //继续分割字符串并进行处理
        while (stk.hasMoreElements()) {
            String nextString[] = stk.nextToken().split(",");
            int x, y;
            try {
                if (hm.containsKey(nextString[0])) {
                    switch (hm.get(nextString[0])) {
                        case 0:
                            x = Integer.parseInt(nextString[1]);
                            y = Integer.parseInt(nextString[2]);
                            int r = Integer.parseInt(nextString[3]);
                            ms.add(new Circle(x, y, r));
                            break;
                        case 1:
                            x = Integer.parseInt(nextString[1]);
                            y = Integer.parseInt(nextString[2]);
                            ms.add(new Text(nextString[3], x, y));
                            break;
                        case 2:
                            x = Integer.parseInt(nextString[1]);
                            y = Integer.parseInt(nextString[2]);
                            double w = Double.parseDouble(nextString[3]);
                            double h = Double.parseDouble(nextString[4]);
                            ms.add(new Square(x, y, w, h));
                            break;
                        case 3:
                            x = Integer.parseInt(nextString[1]);
                            y = Integer.parseInt(nextString[2]);
                            int x1 = Integer.parseInt(nextString[3]);
                            int y1 = Integer.parseInt(nextString[4]);
                            ms.add(new Line(x, y, x1, y1));
                            break;
                        case 4:
                            x = Integer.parseInt(nextString[1]);
                            y = Integer.parseInt(nextString[2]);
                            double f = Double.parseDouble(nextString[3]);
                            double s = Double.parseDouble(nextString[4]);
                            double t = Double.parseDouble(nextString[5]);
                            ms.add(new Triangle(x, y, f, s, t));
                            break;
                    }
                } else {
                    throw new Exception("读取文件格式错误");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }

        }
        return ms;
    }
    
    public Vector<MyShape> loadFile() throws IOException, ClassNotFoundException{
        //get file through fileChooser
        File file=getOpenFile();
        String filePath=file.getPath();
        
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(filePath));
        Vector<MyShape> ms=(Vector<MyShape>)inputStream.readObject();
        return ms;
    }
    
    public File getSaveFile(){
        JFileChooser fcChooser=new JFileChooser(".");
        if(fcChooser.showSaveDialog(fcChooser)==JFileChooser.APPROVE_OPTION)
            return fcChooser.getSelectedFile();
        else
            return null;
    }
    
    public File getOpenFile(){
        JFileChooser fcChooser=new JFileChooser(".");
        if(fcChooser.showOpenDialog(fcChooser)==JFileChooser.APPROVE_OPTION)
            return fcChooser.getSelectedFile();
        else
            return null;
    }
}
