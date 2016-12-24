/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myGraph;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author yao
 */
public class Text extends MyShape implements Serializable{
    private final int coordinate[];
    private final String str;

    public Text(String string,int xCoordinate, int yCoordinate) {
        str=string;
        coordinate = new int[2];
        coordinate[0] = xCoordinate;
        coordinate[1] = yCoordinate;

    }

    public Text(String shortStr) {
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
    
    public String getContent(){
        return str;
    }
    
    public int[] getCoordinate(){
        return coordinate;
    }
    
    @Override
    public String toString() {
        return "Text:"+str+" at ("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+") ";
    }

    @Override
    public String toShortString() {
        return "T,"+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+","+str;   
    }
    
    @Override
    public double get_length() {
        return 0;
    }

    @Override
    public double get_area() {
        return 0;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D=(Graphics2D)g;
        g2D.drawString(str, coordinate[0], coordinate[1]);
    }

    /**
     *
     * @return
     */
    

    @Override
    public byte[] toBytesI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
