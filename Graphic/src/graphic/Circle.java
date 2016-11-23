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
public class Circle implements Shape{
    private double radius;
    
    private int coordinate[];
 

    
    @Override
    public String toShortStr() {
        return "C"+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+","+Double.toString(radius);
    }

    @Override
    public void Paint(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g2.drawOval(coordinate[0], coordinate[1], (int)(radius), (int)(radius));
    }
    
    
    public Circle(int xCoordinate,int yCoordinate,double Radius){
        coordinate=new int[2];
        
        coordinate[0]=xCoordinate;
        coordinate[1]=yCoordinate;
        radius=Radius;
    }
    
    public Circle(String shorStr){
        String tempStr=shorStr.substring(1);
        String value[]=tempStr.split(",");
        
        if(value.length!=3){
            JOptionPane.showMessageDialog(null, "You input an wrong characters", "warring", JOptionPane.ERROR);
        }else{
            coordinate=new int[2];
            
            coordinate[0]=Integer.parseInt(value[0]);
            coordinate[1]=Integer.parseInt(value[1]);
            radius=Double.parseDouble(value[2]);
        }
    }
    
    public void SetRadius(double Radius){
        radius=Radius;
    }
    
    @Override
    public double Perimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public double Area(){
        return Math.PI*radius*radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    @Override
    public String toString(){
        return "Circle at"+"("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+"),r="+Double.toString(radius);
    }
}


