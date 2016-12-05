package myGraph;
import java.awt.*;
public abstract class MyShape
{
    public abstract double get_area();
    public abstract double get_length();
    public abstract String toShortString();
    public abstract byte[] toBytesI();
    public abstract void paint(Graphics g);
}