public class BreakAndContinue {
    public static void main(String[] args) {
        
        // break = break out of a loop.
        // continue = skip current iteration of a loop (skip).

        // Break

        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;  // Stops the loop.
            }

            System.out.print(i + " ");
        }

        //--------------------------------------------------------------------//

        // Continue

        System.out.println();
        for(int y = 0; y < 10; y++){

            if(y == 5){
                continue;  // Skips the current iteration.
            }

            System.out.print(y + " ");
        }
    }
}
