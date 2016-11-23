/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.awt.Graphics;

/**
 *
 * @author yao
 */
interface Shape {
    
    public abstract double Perimeter();
    public abstract double Area();
    public abstract void Paint(Graphics g);
    public abstract String toShortStr();
    
    
}
