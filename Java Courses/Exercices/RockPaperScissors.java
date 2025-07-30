package Exercices;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){

        // Rock Paper Scissors Program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare Variables
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        int ties = 0;
        int wins = 0;
        int losses = 0;

        do{
            // Get a choice from user
        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && 
            !playerChoice.equals("paper") && 
            !playerChoice.equals("scissors")){
                System.out.println("Invalid choice! Try again.");
                continue;
            }

        // Get random choice from computer
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        // Check win conditions
        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
            ties++;
        } else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) 
        || (playerChoice.equals("paper") && computerChoice.equals("rock")) 
        || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
            System.out.println("You win!");
            wins++;
        } else {
            System.out.println("You lose!");
            losses++;
        }

        // Ask to play again
        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();
        
        } while(playAgain.equals("yes"));
        
        // Good bye message
        System.out.println("Thanks for playing!");
        System.out.println("Your score: " + wins + " wins, " + losses + " losses, " + ties + " ties.");


        scanner.close();
    }
}
