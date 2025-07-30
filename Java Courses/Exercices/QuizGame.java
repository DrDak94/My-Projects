package Exercices;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // Quiz Game

        Scanner scanner = new Scanner(System.in);

        // Questions Array[]
        String[] questions =   {"What is the main function of a Router?",
                                "Which part of a computer is considered the brain?",
                                "What year was Facebook launched?",
                                "Who is known as the father of the computer?",
                                "What was the first programming language?"};

        // Options Array[][]
        String[][] options =   {{"1. Storing Files", "2. Encrypting Data", "3. Directing internet data", 
                                "4. Managing passwords"}, 
                                {"1. CPU", "2. HardDrive", "3. RAM", "4. GPU"},
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, 
                                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"}, 
                                {"1. Cobol", "2. C", "3. Fortran", "4. Assembly"}};

        // Declare Variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        // Welcome Message
        System.out.println("******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        // Question (loop)
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);


            // Options
            for (String option : options[i]){
                System.out.println(option);
            }

            // Get Guess from User
            System.out.print("Enter your guess (1-4): ");
            guess = scanner.nextInt();

            // Check the guess
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("**********");
                System.out.println("Incorrect!");
                System.out.println("**********");
            }
        }

        // Display final score
        System.out.println("*************************************************************");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        System.out.println("*************************************************************");

        scanner.close();
    }
}
