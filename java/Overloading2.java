import java.util.Scanner;
class Student
{
    int m1,m2,m3,avg;
    Student()
    {
        System.out.println("constructor with no parameters");
    }
    Student(int m1, int m2, int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        avg=(int)(m1+m2+m3)/3;
        System.out.println("average score is "+avg);
    }
    void display(String name,char c)
    {
        System.out.println("Average marks of "+name+" is "+avg+" with grade "+c);
    }
    void display(String name)
    {
        System.out.println("Average marks of "+name+" is "+avg);
    }


}
public class Overloading2
{
    public static void main(String[] args)
    {
        int m1,m2,m3;
        String name;
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        name=s.next();
        System.out.println("enter marks in three subjects");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        System.out.println("enter grade");
        c=s.next().charAt(0);
        Student s1=new Student(m1,m2,m3);
        Student s2=new Student();
        s1.display(name);
        s1.display(name,c);

    }
}
