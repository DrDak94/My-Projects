import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // Array = a collection of values of the same data type.
        // Think of it as a variable that can store more than 1 value.

        String[] fruits = {"apple", "banana", "cherry", "orange"};

        fruits[1] = "grape";  // Change the value of the array at the index selected.

        int numOfFruits = fruits.length;  // Returns the number of elements in the array.

        Arrays.sort(fruits);  // Sorts the elements in the array by alphabetical order or numerical order.
        
        Arrays.fill(fruits, "melon");  // Fills the array with the specified value.

        System.out.println(fruits);  // It display the memory location of the array.
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(numOfFruits);

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }

        System.out.println();

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }


            
    }
}
