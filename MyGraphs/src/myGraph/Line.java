/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myGraph;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yao
 */
public class Line extends MyShape{
    private final int coordinate[];
    private final int coordinate1[];
    
    public Line(int xCoordinate,int yCoordinate,int xCoordinate1,int yCoordinate1){
        coordinate=new int[2];
        coordinate1=new int[2];
        
        coordinate[0]=xCoordinate;
        coordinate[1]=yCoordinate;
        
        coordinate1[0]=xCoordinate1;
        coordinate1[1]=yCoordinate1;
    }

    public Line(String shortStr) {
        String tempStr = shortStr.substring(1);
        String value[] = tempStr.split(",");
        coordinate = new int[2];
        coordinate1=new int[2];
        
        if (value.length != 4) {
            JOptionPane.showMessageDialog(null, "You input an wrong characters", "warring", JOptionPane.ERROR);
        } else {

            coordinate[0] = Integer.parseInt(value[0]);
            coordinate[1] = Integer.parseInt(value[1]);
            coordinate1[0] = Integer.parseInt(value[2]);
            coordinate1[1] = Integer.parseInt(value[3]);
        }
    }

    
    @Override
    public String toString() {
        return "Line at "+"("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+")"+" to ("+Integer.toString(coordinate1[0])+","+Integer.toString(coordinate1[1])+")";
    }

    @Override
    public String toShortString() {
        return "L,"+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+","+Integer.toString(coordinate1[0])+","+Integer.toString(coordinate1[1]);

    }

    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2D=(Graphics2D) g;
        g2D.drawLine(coordinate[0], coordinate[1],coordinate1[0],coordinate1[1]);
    }

    @Override
    public double get_length() {
        int x=coordinate[0]-coordinate1[0];
        int y=coordinate1[1]-coordinate1[1];
        return Math.sqrt(x*x+y*y);
    }

    @Override
    public double get_area() {
        return 0;
    }

    public int []getCoordiante1(){
        return coordinate;
    }
    
    public int []getCoordiante2(){
        return coordinate1;
    }
    @Override
    public byte[] toBytesI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
