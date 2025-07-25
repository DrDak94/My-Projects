import java.util.Scanner;

public class ScannerUserInfo {
    public static void main(String[] args) {
        // How to access user input from the console using the Scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: "); // prompt the user to enter their name.
        String name = scanner.nextLine(); // read the user's input and store it in a variable.
        
        System.out.print("Enter your age: "); // prompt the user to enter their age.
        int age = scanner.nextInt(); // read the user's input and store it in a variable.
        
        System.out.print("Enter your height: "); // prompt the user to enter their height.
        double height = scanner.nextDouble(); // read the user's input ans store it in a variable.

        System.out.print("Are you a student? (true/false)"); // prompt the user to enter their status.
        boolean isStudent = scanner.nextBoolean(); // read the user's input and store it in a variable.
        
        System.out.println("Hello! Your name is: " + name); // will print the user input.
        System.out.println("You are " + age + " years old.");
        System.out.println("You are " + height + " meters tall.");
        
        if(isStudent){
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are NOT enrolled as a student.");
        }
        

        // Scanner Common Issues
        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age2 + " years old.");
        System.out.println("Your favorite color is " + color);


        scanner.close();      // Always close the scanner at the end of your program. 
    }
}

