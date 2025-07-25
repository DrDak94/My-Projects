public class ArithmeticOperators {

    public static void main(String[] args) {

        // Arithmetic Operators

        int x = 10;
        int y = 5;
        int z;

           z = x + y; // Sum
        // z = x - y; // Difference
        // z = x * y; // Product
        // z = x / y; // Quotient
        // z = x % y; // Remainder

        System.out.println(z);

//---------------------------------------------------------------------------------//

        // Augmented Assignment Operators

        int a = 10;
        int b = 3;

        a += b;  // a = a + b;
        //  a -= b;  // a = a - b;
        //  a *= b;  // a = a * b;
        //  a /= b;  // a = a / b;
        //  a %= b;  // a = a % b;

        System.out.println(a);

//---------------------------------------------------------------------------------//

        // Increment and Decrement Operators

        int c = 10;

        c++; // c = c + 1;
        // c--; // c = c - 1;

        System.out.println(c);

//---------------------------------------------------------------------------------//

        // Order of Operations [P-E-M-D-A-S]
        // Parentheses, Exponents, Multiplication, Division, Addition, Subtraction//

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}