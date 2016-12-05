package myGraph;
import java.util.*;
import java.io.*;
import myUI.theUI;
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
    public void saveAsTXT_0()  //byteStream write txt FIle
    {
        File f=theUI.getSaveFile();
        if(f!=null)
          {
          try
            {
               PrintStream ss=new PrintStream(new FileOutputStream(f));
               for(MyShape s:xx)
               ss.println(s.toShortString());
               ss.close();
            }
                    catch(IOException e){}
         }
    }
    public void readFromTXT0()//read txt file format I
    {
        File f=theUI.getOpenFile();
        if(f!=null)
        {
         try
            {
              Scanner ss=new Scanner(new FileInputStream(f));
              String s=null;
              while(ss.hasNext())
              {
                s=ss.next();
                if(s.startsWith("C"))
                add(new Circle(s));
               }
              ss.close();
             }
           catch(IOException e){}
        }                
     }
    public void saveAsBin()   
    //byteStream write BIN File
    {
           File f=theUI.getSaveFile();
           if(f!=null)
           {
            try
               {
                    FileOutputStream ss=new FileOutputStream(f);
                    for(MyShape s:xx)
                    {
                      ss.write(s.toBytesI());
                      ss.flush();
                    }
                     ss.close();
                }
              catch(IOException e){}
            }
    }
    public void readFromBin()
    //read binary file format I   
    {  
        File  f=theUI.getOpenFile();
        if(f!=null)
        {
            long fsize=f.length();
            int number=0;
          try
          {
            DataInputStream ss=new DataInputStream(
                             new FileInputStream(f));                    
           while(number<fsize)                   
           {   int size=ss.readInt();
               ss.skip(-4);
               byte[] t=new byte[size];
               int n=ss.read(t);
               number+=n;
               if(t[4]==1)  //means circle
               add(new Circle(t));
            }
            ss.close();
           }
         catch(IOException e){}
        } 
   }
    public void saveAsTXT_1()  //CharStream write txt FIle
    {
        File f=theUI.getSaveFile();
        if(f!=null)
        {
           try
           {
            OutputStreamWriter ss=new OutputStreamWriter(new FileOutputStream(f));
            BufferedWriter s=new BufferedWriter(ss);
            for(MyShape t:xx)
            {s.write(t.toShortString());s.newLine();}
            s.close();
           }
         catch(IOException e){}
         }
    }
    public void readFromTXT_1()  //CharStream read txt FIle
    {
        File f=theUI.getOpenFile();
        if(f!=null)
        {
           try
           {
            InputStreamReader s0=new InputStreamReader(new FileInputStream(f));
            BufferedReader s=new BufferedReader(s0);
            String ss=null;
            while((ss=s.readLine())!=null)
            {
               if(ss.startsWith("C"))
               xx.add(new Circle(ss));
            }
            s.close();
         }
         catch(IOException e){}
         }
    }
   public void saveAsObj()  //write object File
    {
        File f=theUI.getSaveFile();
        if(f!=null)
        {
           try
           {
            ObjectOutputStream ss=new ObjectOutputStream(new FileOutputStream(f));
            for(MyShape t:xx)            
            ss.writeObject(t);
            ss.close();
         }
         catch(IOException e){}
         }
    }
    public void readFromObj()  //read object FIle
    {
        File f=theUI.getOpenFile();
        if(f!=null)
        { try
           {
            ObjectInputStream ss=new ObjectInputStream(new FileInputStream(f));            
            Object obj=null;           
            while((obj=ss.readObject())!=null)
            {                
                xx.add((MyShape)obj);
            }
            ss.close();
           }
         catch(ClassNotFoundException e){}  
         catch(IOException e){}
       }
   }
}