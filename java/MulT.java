//not working
import java.util.*;
public class MulT
{
    public static void main(String args[])
    {
        sample s=new sample();
        s.start();
    }
}
class even extends Thread
{
    public int x;
    public even(int num)
    {
        x=num;
    }
    public void run()
    {
        System.out.println("New thread "+x+" is even and square of "+x+" is : "+(x*x));
    }
}
class odd extends Thread
{
    public int x;
    public odd(int num)
    {
        x=num;
    }
    public void run()
    {
        System.out.println("New thread "+x+" is odd and cube of "+x+" is : "+(x*x*x));
    }
}
class sample extends Thread
{
int num=0;
public void run()
{
    Random r=new Random();
    for(int i=1;i<=6;i++)
    {
        num=r.nextInt(10);
        System.out.println("Mainthread and generated number is "+num);
    try
    {
        if(num%2==0)
        {
            even e=new even(num);
            e.start();
        }
        else
        {
            odd o=new odd(num);
            o.start();
        }

        Thread.sleep(1000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
        System.out.println("---------------------");
    }
}
}
