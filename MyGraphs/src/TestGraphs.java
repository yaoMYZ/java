import myUI.GtypePanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.MenuBar;
import myGraph.*;
import javax.swing.*;
public class TestGraphs 
{
    static Graphs test=new Graphs();
    static JFrame shapef=new JFrame("Current Shapes")
    {
       {
        //set screan size
        setBounds(100,100,1000,600);
        Container container=getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.add(new JPanel()
        {  
            @Override
            public void paintComponent(Graphics g)
         {
          super.paintComponent(g);        
          test.displayAll(g);
          }
        });
        container.add(new GtypePanel(test),BorderLayout.NORTH);
        //菜单栏
        JMenuBar menuBar=new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Edit"));
        this.setJMenuBar(menuBar);
       }

    };    
    public static void main(String[] args)
    {      
        shapef.setVisible(true);
    }
}
