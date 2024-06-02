import java.util.Scanner;
public class AdamNum {
    public static void main(String[] args) 
    {
        int n,sq,t,rev,sum,y;
        Scanner sc=new Scanner(System.in);
        AdamNum o=new AdamNum();
        n=sc.nextInt();
        y=n;
        sq=n*n;
        sum=o.reverse(sq);
        rev=(int)Math.sqrt(sum);
        t=o.reverse(rev);
        if(t==y)
        System.out.println("it is an adam number");
        else
        System.out.println("it is not a adam number");
        sc.close();
    }
    public int reverse(int x)
    {
        int sum=0,rem;
        while(x>0)
        {
            rem=x%10;
            sum=rem+(sum*10);
            x=x/10;
        } 
        return sum;
    }

}
