package OOP;

public abstract class Shape {
    
    abstract double area();     // Abstract Method

    void display(){             // Concrete Method
        System.out.println("This is a shape.");
    }

}
