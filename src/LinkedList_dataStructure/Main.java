package LinkedList_dataStructure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.AddLast(10);
        list.AddLast(20);
        list.AddLast(30);
        System.out.println(list.indexOf(50));
        System.out.println(list.contains(10));
        var arrray= list.toArray();
        System.out.println(Arrays.toString(arrray));
    }
}
