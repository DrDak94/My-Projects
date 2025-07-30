package OOP.Inheritance;

public class ToStringMethod {
    public static void main(String[] args) {
        
        // .toString() = method inherited from the Object Class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 1969, "Black");
        Car car2 = new Car("Chevrolet", "Corvette", 1971, "Blue");

        System.out.println(car);
        System.out.println(car2);
    }
}
