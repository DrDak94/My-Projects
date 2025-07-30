package Exercices;
import java.util.Scanner;
import java.util.Random;

public class SlotMachineProgram {
    public static void main(String[] args) {
        
        // Slot Machine Program

        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Welcome Message
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots!  ");
        System.out.println("Symbols: Cherry🍒 Melon🍉 Lemon🍋 Bell🔔 Star⭐ ");
        System.out.println("*************************");

        // Play if balance > 0
        while(balance > 0){
            System.out.println("Current Balance: $" + balance);
            // Enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            // Verify if bet > balance
            if(bet > balance){
                System.out.println("Insufficient funds. Please try again.");
                continue;
            }
            // Verify if bet > 0
            else if(bet <= 0){
                System.out.println("Invalid bet amount. Please try again.");
                continue;
            }
            // Subtract bet from balance
            else{
                balance -= bet;
            }
            // Spin Row
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("Congratulations! You won $" + payout + "!");
                balance += payout;
            }
            else{
                System.out.println("Better luck next time!");
            }
            System.out.println("Current Balance: $" + balance);
            System.out.println("*************************");

            // Ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                break;
            }         
        }
        // Exit message
        System.out.println("Game Over! Your final balance is $" + balance + ".");

        scanner.close();
    }

    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("*************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*************************");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
                };
            }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
                };
            }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
                };
            }
        else if(row[0].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
                };
            }
        return 0;
    }

}
