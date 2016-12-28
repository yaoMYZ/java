package myGraph;
import java.util.*;
import java.io.*;
import java.awt.*;
public class Graphs 
{   public Vector<MyShape> xx=new Vector<MyShape>();
    
    public void displayAll(Graphics g)
    {
        for(MyShape x:xx)
            x.paint(g);
    }
    public void displayAll(PrintStream sout)
    { int i=0;
    sout.println("***Total Graphics object count is "+xx.size()+"****");
      for(MyShape s:xx)
         sout.println("["+(i++)+"]"+s);  
    sout.println("****************above graph is all*****");
    }
    public void add(MyShape obj)
    {
        xx.add(obj);
    }    
    public void remove(int index)
    {
        xx.remove(index);
    }
    public int gCount(){return xx.size();}
    
}