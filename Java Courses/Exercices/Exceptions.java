package Exercices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        
        // Exception = an event that interrupts the normal flow of a program.
        // (Dividing by 0, file not found, mismatch input type).
        // Surround any dangerous code with a try{} block.
        // try{}, catch{}, finally{}.

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){   // Catches mismatched inputs.
            System.out.println("You must enter a number!");
        }
        catch(ArithmeticException e){      // Catches Arithmetic exceptions.
            System.out.println("You can't divide by 0!");
        }
        catch(Exception e){                // Catches any other exception/SAFETY NET.
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("This will always run!");
        }


        scanner.close();
    }
}
