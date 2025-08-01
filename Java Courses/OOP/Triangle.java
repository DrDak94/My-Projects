package OOP;

public class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
}
