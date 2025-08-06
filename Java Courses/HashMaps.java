import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // HashMap = a data structure that stores key-values pairs.
        // Keys are unique, but Values can be duplicated.
        // Does not maintain any order, but is memory efficient.
        // HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);            // Add a new key-value pair.
        map.put("orange", 0.65);
        map.put("banana", 0.25);
        map.put("orange", 0.75);           // Override the previous value.
        map.put("coconut", 1.00);

        map.remove("apple");                     // Remove a key-value pair.

        System.out.println(map);                     // Print all key-value pairs.
        System.out.println(map.get("banana"));   // Get the value of a key.

        System.out.println(map.containsKey("banana"));   // Check if a key exists.

        System.out.println(map.containsValue(0.65));   // Check if a value exists.

        System.out.println(map.size());              // Get the number of key-value pairs.

        for(String key : map.keySet()){              // Iterate over the keys and print the values.
            System.out.println(key + " : $" + map.get(key));
        }


    }
}
