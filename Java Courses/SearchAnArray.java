import java.util.Scanner;
public class SearchAnArray {
    public static void main(String[] args){

        // Search an Array

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8 ,3 ,5 ,4};
        int target = 4;

        String[] fruits = {"apple", "banana", "cherry"};
        String target2 = "banana";

        String[] names = {"Davide", "John", "Jane"};
        String target3;
        System.out.print("Enter a name to search for: ");
        target3 = scanner.nextLine();

        boolean isFound = false;
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Number found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Number not found in the Array.");
        }

        isFound = false;
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){
                System.out.println("Fruit found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Fruit not found in the Array.");
        }
        
        isFound = false;
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(target3)){
                System.out.println("Name found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Name not found in the Array.");
        }

        scanner.close();
    }
}
