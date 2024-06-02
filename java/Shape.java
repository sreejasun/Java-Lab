import java.io.*;
import java.util.*;
abstract class shape_area
{
    int x,y;
    shape_area(int a,int b)
    {
        x=a;
        y=b;
    }
    abstract void printarea();
}
class Rectangle extends shape_area
{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    void printarea()
    {
        double f=(x)*(y);
        System.out.println("area of rectangle is "+f);
    }
};
class Circle extends shape_area
{
    Circle(int a)
    {
        super(a,0);
    }
    void printarea()
    {
       double f=3.14*(x)*(x);
       System.out.println("area of circle1 is "+f);
    }
};
class Triangle extends shape_area
{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    void printarea()
    {
        double f=(x)*(y)/2;
        System.out.println("area of triangle is "+f);
    }
};
public class Shape
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter length and breadth of rectangle");
        a=s.nextInt();
        b=s.nextInt();
        Rectangle r=new Rectangle(a,b);
        r.printarea();
        System.out.println("enter radius of a circle");
        a=s.nextInt();
        Circle c=new Circle(a);
        c.printarea();
        System.out.println("enter base and height of the triangle");
        a=s.nextInt();
        b=s.nextInt();
        Triangle t=new Triangle(a,b);
        t.printarea();
    }
}
