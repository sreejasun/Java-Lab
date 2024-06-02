/*class Finaldemo
{
    final int speedlimit=90;
    void run()
    {
        speedlimit=200;
        System.out.println(speedlimit);
    }
    public static void main(String[] args)
    {
        Finaldemo obj= new Finaldemo();
        obj.run();
    }
}*/
/*class bike
{
    final void run()
    {
        System.out.println("running");
    }
};
class Finaldemo extends bike
{
    void run()
    {
        System.out.println("running safely at 100kmph");
    }
    public static void main()
    {
        Finaldemo o=new Finaldemo();
        o.run();
    }
};*/
final class bike{}
class Finaldemo extends bike
{
    void run()
    {
        System.out.println("running safely");
    }
    public static void main(String[] args)
    {
        Finaldemo o=new Finaldemo();
        o.run();
    }
};

