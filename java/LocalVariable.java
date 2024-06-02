class LocalVariable {
public void show() {
int a = 10;
System.out.println("Inside show method, a = " + a);
}
public void display() {
int b = 20;
System.out.println("Inside display method, b = " + b);
 System.out.println("Inside display method, a = " + a);
}
public static void main(String args[]) {
LocalVariable obj = new LocalVariable();
obj.show();
obj.display(); } }
