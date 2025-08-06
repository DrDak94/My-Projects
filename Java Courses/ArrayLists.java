import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        // ArrayList = a resizable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        // ArrayList for integers.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);
        System.out.println("----------------------------------------");

        //--------------------------------------------------------//
        
        // ArrayList for doubles.
        ArrayList<Double> lists = new ArrayList<>();

        lists.add(3.12);
        lists.add(1.23);
        lists.add(2.12);

        System.out.println(lists);
        System.out.println("----------------------------------------");

        //--------------------------------------------------------//
        
        // ArrayList for strings.
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("First String");
        stringList.add("Second String");
        stringList.add("Third String");
        stringList.add("Fourth String");

        // Remove an item from the ArrayList.
        stringList.remove(1);

        System.out.println(stringList);

        System.out.println("----------------------------------------");

        // Replace an item in the ArrayList.
        stringList.set(0, "New First String");

        System.out.println(stringList);

        System.out.println("----------------------------------------");

        // Get a specific item from the ArrayList.
        System.out.println(stringList.get(1));

        System.out.println("----------------------------------------");

        // Get the size of the ArrayList.
        System.out.println(stringList.size());

        System.out.println("----------------------------------------");

        // Sort the ArrayList by alphabetical order or numerical order.
        Collections.sort(stringList);

        System.out.println(stringList);

        System.out.println("----------------------------------------");

        // Loop through the ArrayList and print each item.
        for(String string : stringList) {
            System.out.println(string);
        }
    }
}
