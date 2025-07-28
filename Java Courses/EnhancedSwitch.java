import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        
        // Enhanced Switch = a replacement to many else if statements;
        // Java14 Feature;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day (use the first letter capitalized): ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It's a weekday.");
            case "Saturday", "Sunday" -> 
                System.out.println("It's the weekend!");
            default -> System.out.println(day + " is an invalid day!");
        };

        scanner.close();

    }
    
}
