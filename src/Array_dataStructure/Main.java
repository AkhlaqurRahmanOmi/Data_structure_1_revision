package Array_dataStructure;

public class Main {
    public static void main(String[] args) {
        Dynamic_array array = new Dynamic_array(2);

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(2);
        System.out.println(array.indexOf(40));
        array.print();
    }
}
