package Exercices;
import java.util.Scanner;

public class BankingProgram {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        // Banking Program

        // Declare Variables

        double balance = 0;
        boolean isRunning = true;
        int choice;

        // Display Menu

        while(isRunning){
            System.out.println("********************");
            System.out.println("Banking Program");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");
    
            // Get and Process users choice
    
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
    
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        // Exit Message

        System.out.println("********************");
        System.out.println("Thank you for using our banking program!");
        System.out.println("********************");
        
        
        
        scanner.close();
    }
    // showBalance()
    static void showBalance(double balance) {
        System.out.println("********************");
        System.out.printf("$%.2f\n", balance);
    }
    
    // deposit()
    static double deposit() {
        
        double amount;
        
        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();
        
        if(amount < 0){
            System.out.println("Amount can't be negative.");
            return 0;
        } else {
            return amount;
        }
        
        
        
        
    }
    
    // withdraw()
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds.");
            return 0;
        } 
        else if(amount < 0) {
            System.out.println("Amount can't be negative.");
            return 0;

        } else {
            return amount;
        }
    }



}
