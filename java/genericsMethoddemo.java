class Democlass
{
    public <T> void genericsMethod(T data)
    {
        System.out.println("Generics method\ndata passed: "+data);
    }
}
class genericsMethoddemo
{
    public static void main(String[] args)
    {
        Democlass d=new Democlass();
        d.<String>genericsMethod("java lab");
        d.<Integer>genericsMethod(69);
    }
}
