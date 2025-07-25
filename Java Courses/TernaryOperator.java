import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary Operator ? = Return 1 of 2 values if a condition is true;
        // Variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        int score;

        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        String result = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(result);

        //------------------------------------------------------------------------//

        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        //------------------------------------------------------------------------//

        int hours;
        System.out.print("Enter the time of day: ");
        hours = scanner.nextInt();

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        System.out.println(timeOfDay);

        //------------------------------------------------------------------------//

        int income;
        System.out.print("Enter your income: ");
        income = scanner.nextInt();

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println("Your tax rate is: " + taxRate + "%");

        scanner.close();
    }
}
