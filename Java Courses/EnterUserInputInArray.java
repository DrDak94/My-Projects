import java.util.Scanner;

public class EnterUserInputInArray {
    public static void main(String[] args){

        // Enter User Input into an Array

        Scanner scanner = new Scanner(System.in);

        // This line creates an empty Array that has 3 empty spaces in it:
        String[] foods = new String[3]; 

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";

        for(String food : foods){
            System.out.println(food);
        }

        //-----------------------------------------------------------------//

        String[] foods2;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods2 = new String[size];

        for(int i = 0; i < foods2.length; i++){
            System.out.print("Enter a food: ");
            foods2[i] = scanner.nextLine();
        }

        for(String food : foods2){
            System.out.println(food);
        }

        scanner.close();
    }
}
