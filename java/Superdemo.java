class Animal
{
    String color="white";
};
class dog extends Animal
{
    String color="black";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Superdemo
{
    public static void main(String[] args)
    {
        dog d=new dog();
        d.printcolor();
    }

}
