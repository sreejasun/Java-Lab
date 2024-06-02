import java.util.Scanner;
public class ShortAdam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        StringBuffer sb=new StringBuffer(String.valueOf(sq));
        //System.out.println(sb.reverse());
        int sqrt=(int)Math.sqrt(Integer.parseInt(sb.reverse().toString()));
        StringBuffer sb1= new StringBuffer(String.valueOf(sqrt));
        int f=Integer.parseInt(sb1.reverse().toString());
        if(n==f)
        System.out.println("adam number");
        else
        System.out.println("not adam number");
        sc.close();
    }
}
