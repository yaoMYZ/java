/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author yao
 */
public class DrawString implements Shape{
    private final int coordinate[];
    private final String str;

    public DrawString(String string,int xCoordinate, int yCoordinate) {
        str=string;
        coordinate = new int[2];
        coordinate[0] = xCoordinate;
        coordinate[1] = yCoordinate;

    }

    public DrawString(String shortStr) {
        String value[]=shortStr.split(",");
        coordinate=new int[2];
        str=value[0];
        
        if(value.length!=3){
            JOptionPane.showMessageDialog(null, "You input an wrong characters", "warring", JOptionPane.ERROR);
        }else{
            
            coordinate[0]=Integer.parseInt(value[1]);
            coordinate[1]=Integer.parseInt(value[2]);
        }
    }
    
    @Override
    public String toString() {
        return "String:"+str+" at ("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+") ";
    }

    
    @Override
    public double Perimeter() {
        return 0;
    }

    @Override
    public double Area() {
        return 0;
    }

    @Override
    public void Paint(Graphics g) {
        Graphics2D g2D=(Graphics2D)g;
        g2D.drawString(str, coordinate[0], coordinate[1]);
    }

    /**
     *
     * @return
     */
    @Override
    public String toShortStr() {
        return str+","+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1]);   
    }
    
}
