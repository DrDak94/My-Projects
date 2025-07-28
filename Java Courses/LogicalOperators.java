import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical Operators
        
        // && = AND 
        // || = OR 
        // ! = NOT

        //-------------------------------------------------------------//

        Scanner scanner = new Scanner(System.in);

        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){                // Both conditions must be true.
            System.out.println("The weather is good!");
            System.out.println("It's sunny outside!");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){          // Both conditions must be true, but the third condition must be false.
            System.out.println("The weather is good!");
            System.out.println("It's cloudy outside!");
        }
        else if(temp > 30 || temp < 0) {                       // At least one of the conditions must be true.                
            System.out.println("The weather is bad!");
        }

        //-------------------------------------------------------------//

        // Username must be between 4 and 12 characters;
        // Username must not contain spaces or underscores;

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters.");
        } else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        }
        else{
            System.out.println("Welcome " + username + "!");
        }



        scanner.close();
    }
}
