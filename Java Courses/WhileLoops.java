import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

        // While Loops = repeat some code forever while some condition remains true.

       Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: "); // It goes on forever until the condition is false.
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name + "!");

        //--------------------------------------------------------------------//

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("You are playing a game.");
            System.out.println("Press Q to quit.");
            response = scanner.nextLine().toUpperCase();
        }
        System.out.println("You have quit the game.");

        //--------------------------------------------------------------------//

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative.");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");

        //--------------------------------------------------------------------//

        int number1 = 0;

        do{
            System.out.println("Enter a number between 1 and 10:");
            number1 = scanner.nextInt();
        }while(number1 < 1 || number1 > 10);

        System.out.println("You picked " + number1 + "!");

       scanner.close();
    }
}
