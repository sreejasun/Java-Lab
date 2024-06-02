import java.util.*;
class A
{
    int x;
    void getA()
    {
        System.out.println("enter x");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
    }
}
class B extends A
{
    int y;
    void getB()
    {
        System.out.println("enter y");
        Scanner s=new Scanner(System.in);
        y=s.nextInt();
    }
}
class C extends B
{
    void result()
    {
        System.out.println("sum of x,y is "+(x+y));
    }
}
class Multilevel_inheritance
{
    public static void main(String[] args)
    {
        C o=new C();
        o.getA();
        o.getB();
        o.result();
    }
}

