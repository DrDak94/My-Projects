package OOP;

public class ArrayOfObjects {
    public static void main(String[] args){

        // Array of Objects

        Car2[] cars = {new Car2("Mustang", "Red"), 
                        new Car2("Corvette", "Blue"), 
                        new Car2("F-150", "White")};

        for(Car2 car : cars){
            car.color = "black";
        }

        for(Car2 car : cars){
            car.drive();
        }


    }
}
