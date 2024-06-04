package Array_dataStructure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dynamic_array array = new Dynamic_array(2);

        ArrayList <Integer> list = new ArrayList <>();

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(2);
        System.out.println(array.indexOf(40));
        array.print();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        list.lastIndexOf(list);
        System.out.println(list.size());
        System.out.println(list);
        list.toArray();
    }
}
