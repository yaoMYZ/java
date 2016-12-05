/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myGraph;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
/**
 *
 * @author yao
 */
public class Square extends MyShape {
    private double width;
    private double height;
    
    private final int []coordinate;

    @Override
    public String toShortString() {
           return "S"+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+","+Double.toString(width)+Double.toString(height);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g.drawRect(coordinate[0], coordinate[1], (int) (width), (int)(height));
    }
    
    
    public Square(int xCoordinate,int yCoordinate,double Width,double Height){
        coordinate=new int[2];
        coordinate[0]=xCoordinate;
        coordinate[1]=yCoordinate;
        width=Width;
        height=Height;
    }

    public Square(String shortStr) {
        String tempStr = shortStr.substring(1);
        String value[] = tempStr.split(",");
        coordinate = new int[2];
        
        if (value.length != 4) {
            JOptionPane.showMessageDialog(null, "You input an wrong characters", "warring", JOptionPane.ERROR);
        } else {

            coordinate[0] = Integer.parseInt(value[0]);
            coordinate[1] = Integer.parseInt(value[1]);

            width=Double.parseDouble(value[2]);
            height=Double.parseDouble(value[3]);
        }
    }
    
    
    @Override
    public double get_area(){
        return width*height;
    }
    
    @Override
    public double get_length(){
         return 2*(width+height);
    }
    
    public void setEdge(double Width,double Height){
        width=Width;
        height=Height;
    }
    
    public double GetWidth(){
        return width;
    }
    
    public double GetHeight(){
        return height;
    }
    
    public int[] getCoordiante(){
        return coordinate;
    }
    @Override
     public String toString(){
        return "Square at"+"("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+"),width="+Double.toString(width)+",height="+Double.toString(height);
    }

    @Override
    public byte[] toBytesI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




