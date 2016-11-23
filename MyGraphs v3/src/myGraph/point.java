package myGraph;
public class point implements java.io.Serializable
{
        public int x;
        public int y;
        point(int xx,int yy)
        {
            x=xx;
            y=yy;
        }
        public String toString()
        {
            return "Point("+x+","+y+")";
        }
    }
  