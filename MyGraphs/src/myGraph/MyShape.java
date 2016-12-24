package myGraph;
import java.awt.*;
import java.io.Serializable;
public abstract class MyShape implements Serializable
{
    public abstract double get_area();
    public abstract double get_length();
    public abstract String toShortString();
    public abstract byte[] toBytesI();
    public abstract void paint(Graphics g);
}