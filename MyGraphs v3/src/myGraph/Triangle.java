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
public class Triangle extends MyShape{
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;
    
    //the first coordinate
    private int coordinate[];
    //the second coordinate
    private int coordinate1[];
    //the third coordinate
    private int coordinate2[];
    //Jude if Create successful
    private boolean ifCreateWell;

    @Override
    public String toShortString() {
        return "T"+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+","+Double.toString(firstEdge)+","+Double.toString(secondEdge)
                +","+Double.toString(thirdEdge);
   }

    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;

        g2.drawLine(coordinate[0], coordinate[1], coordinate1[0], coordinate1[1]);
        g2.drawLine(coordinate1[0], coordinate1[1], coordinate2[0], coordinate2[1]);
        g2.drawLine(coordinate2[0], coordinate2[1], coordinate[0], coordinate[1]);
    }
    //Jude if Create successful
    public boolean IfCreateWell(){
        return ifCreateWell;
    }
    
    public Triangle(int xCoordinate,int yCoordinate,double FirstEdge,double SecondEdge,double ThirdEdge){
        try {
             if(SecondEdge+ThirdEdge<FirstEdge||ThirdEdge+FirstEdge<SecondEdge||FirstEdge+SecondEdge<ThirdEdge){
                 ifCreateWell=false;
                 throw new Exception("此三边没法形成三角形");
             }
                 
             firstEdge=FirstEdge;
             secondEdge=SecondEdge;
             thirdEdge=ThirdEdge;
             
             coordinate=new int[2];
             coordinate1=new int[2];
             coordinate2=new int[2];
             
             coordinate[0]=xCoordinate;
             coordinate[1]=yCoordinate;
             //initial the other two coordinates
             SetCoordinate(xCoordinate, yCoordinate);
             ifCreateWell=true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
       
    }

    public Triangle(String shortStr) {
        String tempStr = shortStr.substring(1);
        String value[] = tempStr.split(",");

        if (value.length != 5) {
            JOptionPane.showMessageDialog(null, "You input an wrong characters", "warring", JOptionPane.ERROR);
        } else {
            coordinate = new int[2];

            coordinate[0] = Integer.parseInt(value[0]);
            coordinate[1] = Integer.parseInt(value[1]);

            firstEdge = Double.parseDouble(value[2]);
            secondEdge = Double.parseDouble(value[3]);
            thirdEdge = Double.parseDouble(value[4]);
            try {
                if (secondEdge + thirdEdge < firstEdge || thirdEdge + firstEdge < secondEdge || firstEdge + secondEdge < thirdEdge) {
                    ifCreateWell = false;
                    throw new Exception("此三边没法形成三角形");
                }
                ifCreateWell = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    
    
    
    @Override
    public String toString(){
        return "Triangle at"+"("+Integer.toString(coordinate[0])+","+Integer.toString(coordinate[1])+"),e="+
                Double.toString(firstEdge)+","+Double.toString(secondEdge)+","+Double.toString(thirdEdge);
    }
    
    public void SetEdge(double FirstEdge,double SecondEdge,double ThirdEdge){
        try {
             if(SecondEdge+ThirdEdge<FirstEdge||ThirdEdge+FirstEdge<SecondEdge||FirstEdge+SecondEdge<ThirdEdge)
                 throw new Exception("此三边没法形成三角形");
             firstEdge=FirstEdge;
             secondEdge=SecondEdge;
             thirdEdge=ThirdEdge;
             SetCoordinate(coordinate[0], coordinate[1]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public double get_length(){
        return firstEdge+secondEdge+thirdEdge;
    }
    
    @Override
    public double get_area(){
        double s=(firstEdge+secondEdge+thirdEdge)/2;
        return Math.sqrt(s*(s-firstEdge)*(s-secondEdge)*(s-thirdEdge));
    }
    
    public void SetCoordinate(int xCoordinate,int yCoordinate){
       double angle=Math.acos((firstEdge*firstEdge+thirdEdge*thirdEdge-secondEdge*secondEdge)/(2*firstEdge*thirdEdge));
       int height=(int) (Math.sin(angle)*thirdEdge);//use the firstEdge as buutom edge and get the height of this triangle basing on the buttom edge
       int leftPart=(int)(Math.cos(angle)*thirdEdge);
       int rightPart=(int) (firstEdge-leftPart);
       coordinate1[0]=xCoordinate-rightPart;
       coordinate2[0]=xCoordinate+leftPart;
       coordinate1[1]=coordinate2[1]=yCoordinate+height;
    }
    
    public int[] GetCoordiante(){
        int newCoordianteArray[]={coordinate[0],coordinate[1],coordinate1[0],coordinate1[1],coordinate2[0],coordinate2[1]};
        return newCoordianteArray;
    }

    @Override
    public byte[] toBytesI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



