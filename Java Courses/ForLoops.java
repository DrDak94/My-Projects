import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException{

        // For Loop = execute some code a certain amount of times.

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        //------------------------------------------------------------------------//

        // Countdown Program

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("BOOM!");

        scanner.close();

    }

}
