package OOP;

public class Interfaces {
    public static void main(String[] args) {
        
        // Interface = a blueprint for a class that specifies a set of abstract methods that any implementing classes MUST define.
        // Supports multiple inheritance-like behaviors.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
