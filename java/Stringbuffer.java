import java.io.*;
public class Stringbuffer
{
    public static void main(String[] args)
    {
        StringBuffer s=new StringBuffer("CMRCET");
        s.insert(6,"College");
        System.out.println(s);
        s.insert(0, 5);
        System.out.println(s);
        s.insert(3,true);
        System.out.println(s);
        s.append("java");
        System.out.println(s);
        char s_arr[]={'C','S','E'};
        s.insert(0,s_arr);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.delete(0,5);
        System.out.println(s);
        s.deleteCharAt(7);
        System.out.println(s);
        s.replace(5,8,"are");
        System.out.println(s);
    }
}
