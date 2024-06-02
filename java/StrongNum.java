import java.util.Scanner;

public class StrongNum 
{
    public static void main(String[] args) 
    {
        int n,i,rem,sum=0,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        StrongNum o=new StrongNum();
        while(n>0)
        {
        rem=n%10;
        sum+=o.factorial(rem);
        n=n/10;
        }
        if(sum==t)
        System.out.println("it is a strong number");
        else
        System.out.println("not a strong number");
    }
    public int factorial(int r)
    {
        int fact=1;
        for(int i=1;i<=r;i++)
        fact*=i;
        return fact;
    }

}
