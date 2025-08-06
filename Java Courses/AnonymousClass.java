public class AnonymousClass{
    public static void main(String[] args) {

        // Anonymous Class = a class that doesn't have a name. Cannot be reused.
        // Add custom behavior without having to create a new class.
        // Often used for one time uses (TimerTask, Runnable, callbacks).

        Dog dog1 = new Dog();
        
        Dog dog2 = new Dog(){  // Add curly braces to create an anonymous class.
            @Override
            void speak(){
                System.out.println("I can talk!");
            }
        };

        dog1.speak();
        dog2.speak();
        


    }
    
}