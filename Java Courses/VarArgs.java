public class VarArgs {
    public static void main(String[] args){

        // VarArgs = allow a method to accept a varying number of arguments.
        // Make methods more flexible, no need for overloaded methods.
        // Java will pack the arguments into ar Array
        // ...(Ellipsis).

        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(average(1, 2, 3, 4, 5, 6));
        System.out.println(average());

    }
    static int add(int... numbers){
        
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;

    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
