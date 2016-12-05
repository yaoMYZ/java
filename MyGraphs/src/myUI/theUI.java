package myUI;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class theUI {
    public static File getSaveFile()
    {
        JFileChooser r=new JFileChooser();
        if(r.showSaveDialog(r)==JFileChooser.APPROVE_OPTION)
            return r.getSelectedFile();
        else 
            return null;
    }
     public static File getOpenFile()
    {
        JFileChooser r=new JFileChooser();
        if(r.showOpenDialog(r)==JFileChooser.APPROVE_OPTION)
            return r.getSelectedFile();
        else 
            return null;
    }
    public static int getSelected(String title,String[] menu,InputStream in,PrintStream out)
    {   int i;
        Scanner ss=new Scanner(in);
        do
        {
          i=-1;   
          out.println(title);
          for(String s:menu)
            out.println("["+(++i)+"] "+s);       
            out.println("please input the above index");
            i=ss.nextInt();
        }while((i<0)||(i>=menu.length));
        return i;
    }
}
