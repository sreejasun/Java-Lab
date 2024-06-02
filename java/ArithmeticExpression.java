import java.io.*;
import java.util.Scanner;
public class ArithmeticExpression
{
    public static void main(String[] args)
    {
        float a,b,res=0;
        char op;
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        res=a;
        do
        {
            op=s.next().charAt(0);
            if(op!='=')
            {
            b=s.nextFloat();
            switch(op)
            {
                case '+':res+=b;break;
                case '-':res-=b;break;
                case '*':res*=b;break;
                case '/':res/=b;break;
                case '%':res%=b;break;
            }
            }
        }
        while(op!='=');
            System.out.println(res);
    }
}
