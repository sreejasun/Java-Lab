class Gen<T>
{
    T ob;
    Gen(T ob)
    {
        this.ob=ob;
    }
    public void show()
    {
        System.out.println("the type of ob: "+ob.getClass().getName());
    }
    public T getob()
    {
        return ob;
    }
}
class GenDemo
{
    public static void main(String[] args)
    {
        Gen<String> g1=new Gen<String>("abcde");
        g1.show();
        System.out.println(g1.getob());
        Gen<Integer> g2=new Gen<Integer>(54);
        g2.show();
        System.out.println(g2.getob());
    }
}
