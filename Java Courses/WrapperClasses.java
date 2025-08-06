public class WrapperClasses {
    public static void main(String[] args) {

        // Wrapper classes = allow primitive values (int, char, double, boolean) to be used as objects. "Wrap them in an object".
        // Generally, don't wrap primitives unless you need an object.
        // Allow use of Collections Framework and Static Utility Methods.

        // Autoboxing = automatic conversion of primitive types to their corresponding wrapper classes.
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;

        // Unboxing = automatic conversion of wrapper classes to their corresponding primitive types.
        // int x = a;
        // double f = b;
        // char g = c;
        // boolean h = d;

        //------------------------------------------------------------------------------//

        // String a = Integer.toString(123);
        // String b = Double.toString(3.14);
        // String c = Character.toString('$');
        // String d = Boolean.toString(true);

        // String x = a + b + c + d;

        // System.out.println(x);

        //------------------------------------------------------------------------------//

        // int a = Integer.parseInt("123");
        // double b = Double.parseDouble("3.14");
        // char c = "Pizza".charAt(0);
        // boolean d = Boolean.parseBoolean("true");

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);

        //------------------------------------------------------------------------------//

        // char letter = 'b';
        // char letter2 = '$';

        // System.out.println(Character.isLetter(letter));   // Returns true if the character is a letter.
        // System.out.println(Character.isLetter(letter2));  // Returns false as the character is not a letter.
        // System.out.println(Character.isUpperCase(letter));  // Returns true if the character is uppercase.

        //------------------------------------------------------------------------------//



    }
}
