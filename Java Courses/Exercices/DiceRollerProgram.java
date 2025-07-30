package Exercices;
import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {
    
    public static void main(String[] args) {
        
        // Dice Roller Program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare Variables

        int numOfDice;
        int total = 0;

        // Get Number of Dice from the user

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // Check if Number is > 0
        // Roll all the Dice
        // Get the total

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Please enter a number greater than 0.");
        }

        // Display Art of Dice




        scanner.close();
    }

    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                """;

        String dice3 = """
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                """;

        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                """;

        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                """;

        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                """;
                
                switch(roll){
                    case 1 -> System.out.println(dice1);
                    case 2 -> System.out.println(dice2);
                    case 3 -> System.out.println(dice3);
                    case 4 -> System.out.println(dice4);
                    case 5 -> System.out.println(dice5);
                    case 6 -> System.out.println(dice6);
                    default -> System.out.println("Invalid roll.");

                }
    }
    
}
