package myGraph;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
public class Circle extends MyShape implements java.io.Serializable
{
    private int r;
    private point p1;
   
    public Circle(int x1,int y1,int r1)
    {
        p1=new point(x1,y1);
        r=r1;
    }
    public Circle(byte[] t)
    {
        ByteArrayInputStream in=new ByteArrayInputStream(t);
        DataInputStream sin=new DataInputStream(in);
        if(t.length==getByteCount())
        {
            try{
                
            if((sin.readInt()==getByteCount())&&
               (sin.readByte()==getTypeCode()))
            {
               r=sin.readInt();
               int x=sin.readInt();
               int y=sin.readInt();
               p1=new point(x,y);
               sin.close();
            }
            }
            catch(IOException e){}
        }
    }
    public Circle(String s)
    {   String[]ss;
        if((s!=null)&&(!s.isEmpty())&&(s.startsWith("C"))&&((ss=s.split(",")).length==3))
        {
            r=Integer.parseInt(ss[0].substring(1));
            int x=Integer.parseInt(ss[1]);
            int y=Integer.parseInt(ss[2]);
            p1=new point(x,y);
        }
    }
    
    public int getR(){
        return r;
    }
    
    public point getPoint(){
        return p1;
    }
    public double get_area()
    {
        return 3.14*r*r;
    }
    public double get_length()
    {
        return 2*3.14*r;
    }
    @Override
    public String toString()
    {
        return "Circle r="+r+" at "+p1;
    }
    public String toShortString()
    {
        return "C"+r+","+p1.x+","+p1.y;
    }
   int getByteCount(){int len=3*4+1*4+1;return len;}
   byte getTypeCode(){return (byte)1;}//type means circle =1
   public byte[] toBytesI()
    {
        byte[] res=null;
        
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        DataOutputStream sout=new DataOutputStream(out);
        try{
        sout.writeInt(getByteCount());
        sout.writeByte(getTypeCode());
        sout.writeInt(r);
        sout.writeInt(p1.x);
        sout.writeInt(p1.y);
        res=out.toByteArray();
        sout.close();
        }catch(IOException e){}                
        return res;
    }
   public void paint(Graphics g)
   {
       g.drawOval(p1.x-r, p1.y-r,2*r, 2*r);
   }
}