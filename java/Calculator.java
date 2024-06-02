
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Calcy obj=new Calcy();
        obj.arth();
    }
}
class Calcy
{
    float a,b,res;
    void arth()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two no.s");
        a=s.nextFloat();
        b=s.nextFloat();
        System.out.println("enter operation to carry out:\n1. +\n2. -\n3. *\n4. /\n5. %");
        char op=s.next().charAt(0);
        switch(op)
        {
            case '+':res=a+b;break;
            case '-':res=a-b;break;
            case '*':res=a*b;break;
            case '/':res=a/b;break;
            case '%':res=a%b;break;
            default:System.out.println("invalid operation");
        }
        System.out.println("res is: "+res);
    }
};
