public class GettersAndSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // Getters = methods that make a field readable.
        // Setters = methods that make a field writable.

        Car car = new Car("Charger", "Yellow", 10000);

        // car.model = "Corvette";  // This won't work cause it's private.

        // System.out.println(car.color + " " + car.model + " " + car.price);  // This won't work cause it's private.
        
        car.setColor("Blue");
        car.setPrice(-15000);
        
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
