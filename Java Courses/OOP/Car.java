package OOP;

public class Car {
    

    String make = "Ford"; 
    String model = "Mustang"; 
    int year = 1969;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Starting the car...");
    }
    void stop(){
        isRunning = false;
        System.out.println("Stopping the car...");
    }
    void drive(){
        System.out.println("Driving the " + model + "...");
    }
    void brake(){
        System.out.println("Braking the " + model + "...");
    }
}
