package OOP;
import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        
        // Runtime Polymorphism = when the method that gets executed is decided at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Do you prefer dog or cat? (1 = dog, 2 = cat)"); // prompt the user to enter their preference.
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }




        scanner.close();
    }
}
