package OOP.Inheritance;

public class Super {
    public static void main(String[] args){

        // Super = refers to the parent class(subclass/child <- superclass/parent).
        // Used in constructors and method overriding.
        // Calls the parent constructor to initialize attributes.

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 4.0);
        Employee employee = new Employee("Rubeus", "Hagrid", 80000);

        person.showName();
        student.showName();
        student.showGpa();
        employee.showName();
        employee.showSalary();

    }
}
