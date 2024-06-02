import java.util.Scanner;
import java.io.*;
public class Arthimetic_Exception
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two values");
        a=s.nextInt();
        b=s.nextInt();
        try
        {
            c=a/b;
            System.out.println("resultant is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}
