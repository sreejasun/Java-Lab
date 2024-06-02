import java.util.Scanner;
public class Overloading
{
    void overloading()
    {
        System.out.println("Constructor");
    }
    void overloading(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Overloading obj=new Overloading();
        obj.overloading();
        obj.overloading(10);
    }
}
