import myUI.GtypePanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import myGraph.*;
import myUI.*;
import java.util.*;
import javax.swing.*;
public class TestGraphs 
{
    static Graphs test=new Graphs();
    static JFrame shapef=new JFrame("Current Shapes")
    {
       {
        //set screan size
        setBounds(100,100,600,500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new JPanel()
        {  
            @Override
            public void paintComponent(Graphics g)
         {
          super.paintComponent(g);        
          test.displayAll(g);
          }
        });
        getContentPane().add(new GtypePanel(test),BorderLayout.NORTH);
        }

    };    
    public static void main(String[] args)
    {      
        shapef.setVisible(true);
    }
}
