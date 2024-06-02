package p2;
import p1.*;
import java.util.Scanner;
class Person1 implements MyInterface
{
    String name,bc;
    public void getData()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name & location");
        name=s.next();
        bc=s.next();
    }
    public void display()
    {
        System.out.println("name="+name+ "location="+bc);
    }
}
class Student1 implements MyInterface
{
    String name,htno;
    int marks;
    public void getData()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name,rollno.& marks");
        name=s.next();
        htno=s.next();
        marks=s.nextInt();
    }
    public void display()
    {
        System.out.println("name="+name+ "rollno="+htno+ "marks="+marks);
    }
}
public class Student
{
    public static void main(String[] args)
    {
        Person1 p=new Person1();
        Student1 s=new Student1();
        p.getData();
        p.display();
        s.getData();
        s.display();
    }
}
