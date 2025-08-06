public class Composition {
    public static void main(String[] args) {

        // Composition = represents a "part-of" relationship between objects.
        // For example: an engine is "part of" a car.
        // Allows complex objects to be constructed from smaller objects.

        Car2 car = new Car2("Corvette", 2025, "V8");

        System.out.println(car.models);
        System.out.println(car.years);
        System.out.println(car.engine.type);

        car.start();
    }
}
