
import graphic.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yao
 */
public class Try {
        public static void main(String[] args) {
        Circle c=new Circle("C100,199,3");
        System.out.println(c.toString());
        
        Triangle t=new Triangle("C19,10,2,3,2");
        System.out.println(t.toString());
        
        Square s=new Square("S100,20,3,4");
        System.out.println(s.toString());
        
        Line l=new Line("L100,2,3,4");
        System.out.println(l.toString());
        
        DrawString ds=new DrawString("king,100,100");
        System.out.println(ds.toString());
    }
}
