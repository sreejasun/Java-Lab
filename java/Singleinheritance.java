import java.io.*;
class parentclass
{
    int a;
    void setdata(int x)
    {
        a=x;
    }
}
class childclass extends parentclass
{
    void showdata()
    {
        System.out.println("value of a: "+a);
    }
}
public class Singleinheritance
{
    public static void main(String[] args)
    {
        childclass c=new childclass();
        c.setdata(100);
        c.showdata();
    }
}
