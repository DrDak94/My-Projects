package OOP.Inheritance;

public class Student extends Person{
    
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last); // calls the constructor from the parent class
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }

}
