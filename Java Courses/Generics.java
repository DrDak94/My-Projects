import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        // Generics = a concept where you can write a class, interface, or method that is compatible with different data types.
        // <T> type parameter (placeholder that gets replaced with a real type).
        // <String/Integer/Double/Boolean> type argument (specifies the type).

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);
        
        //---------------------------------------------------------//

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        //---------------------------------------------------------//

        Box<String> box = new Box<>();

        box.setItem("Things I want to put inside the box.");

        System.out.println(box.getItem());

        //---------------------------------------------------------//

        Box<Integer> box2 = new Box<>();

        box2.setItem(1);

        System.out.println(box2.getItem());

        //---------------------------------------------------------//

        Product<String, Double> product = new Product<>("apple", 0.55);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        
        Product<String, Integer> product2 = new Product<>("banana", 1);

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());


    }
}
