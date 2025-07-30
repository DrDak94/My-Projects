package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" = "MANY" and "MORPH" = "SHAPE".
        // Objects can identify as other objects.
        // Objects can be treated as objects of a common superclass.
        
        Car3 car = new Car3();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        System.out.println();

        Vehicle[] vehicles = {car, bike, boat};
        
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
