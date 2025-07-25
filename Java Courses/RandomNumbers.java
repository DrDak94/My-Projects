import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 7); // Origin included, bound not included.
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        //-----------------------------------------------------------------------------//

        double number4 = random.nextDouble(0, 7); // If we don't specify origin and bound, it will be between 0 and 1.
        System.out.println(number4);

        //-----------------------------------------------------------------------------//

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
        }
}


