import java.util.Scanner;
public class Nullpointer_Exception
{
    public static void main(String[] args)
    {
        String s=null;
        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }

        System.out.println("rest of code");
    }
}
