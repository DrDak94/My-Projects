public class MultiThreading {
    
    public static void main(String[] args) {
        
        // Multithreading = enables a program to run multiple threads concurrently.
        // (Thread = a set of instructions that can run independently).
        // Useful for background tasks or time-consuming operations.

        Thread thread1 = new Thread(new MyRunnables("PING"));
        Thread thread2 = new Thread(new MyRunnables("PONG"));

        System.out.println("Starting game...");

        thread1.start();
        thread2.start();

        try{
        thread1.join();
        thread2.join();
        } catch (InterruptedException e){
            System.out.println("Main Thread was interrupted.");
        }

        System.out.println("Game Over");

    }
}
