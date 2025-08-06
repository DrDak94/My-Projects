package Exercices;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExercise {
    public static void main(String[] args) {

        // How to create an ArrayList adding the user inputs to it.
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);




        scanner.close();
    }
    
}
