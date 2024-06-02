import java.util.*;
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();

        list.add("A");
        list.add(10);
        list.add("A");
        list.add(null);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2, "M");
        list.add("N");
        System.out.println(list);

    }
}
