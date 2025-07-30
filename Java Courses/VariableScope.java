public class VariableScope {

    static int x = 3; // Class Variable
    public static void main(String[] args) {
    
        // Variable Scope = where a variable can be accessed.
        // Local Variable
        // Class Variable

        int x = 1;  // Local Variable

        System.out.println(x);  // Even though the Class Variable has been assigned, it will use the Local Variable instead.
        doSomething(); // It display the x value from the local variable where the method is created.
    }
    static void doSomething(){

        int x = 2;

        System.out.println(x);
    }
}
