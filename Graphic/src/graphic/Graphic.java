/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.util.ArrayList;
/**
 *
 * @author yao
 */
public class Graphic {
    public final ArrayList<Shape> Data;

    public Graphic() {
        Data=new ArrayList<>();
    }

    public boolean add(Shape e) {
        return Data.add(e);
    }

    public Shape remove(int index) {
        return Data.remove(index);
    }


    public String showString() {
        String showString = "";
        showString += "Graphic:" + "\r\n";
        int reg = 0;
        for (Shape t : Data) {
            showString += "[" + Integer.toString(reg) + "]" + t.toString() + "\r\n";
            reg++;
        }
        return showString;
    }

}




