class c_exp extends Exception
{
    String message;
    c_exp(String str)
    {
        message=str;
    }
    public String toString()
    {
        return ("custom exception occured: "+message);
    }
}
public class Custom_exception
{
    public static void main(String[] args)
    {
        try
        {
            throw new c_exp("this is custom message");
        }
        catch(c_exp e)
        {
            System.out.println(e);
        }
    }
}
