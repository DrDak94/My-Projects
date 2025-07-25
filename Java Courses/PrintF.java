public class PrintF {
    public static void main(String[] args) {
        
        // printf() = a method used to format output.

        // %[flags][width][.precision][specifier-character]

        //--------[specifier-character]--------//

        // %s = string
        // %c = character
        // %d = decimal
        // %f = float
        // %b = boolean

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s.\n", name);
        System.out.printf("Your name starts with a %c.\n", firstLetter);
        System.out.printf("You are %d years old.\n", age);
        System.out.printf("Your height is %.1fcm.\n", height);
        System.out.printf("Employed: %b.\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);

        //-------------[.precision]-------------//

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);  // %.1f = 1 decimal place
        System.out.printf("%.2f\n", price2);  // %.2f = 2 decimal places
        System.out.printf("%.3f\n", price3);  // %.3f = 3 decimal places

        //----------------[flags]----------------//

        // + = output a plus;
        // , = output grouping separator;
        // ( = negative numbers are enclosed in ();
        // space = display a minus if negative, space if positive;

        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;
        double price7 = 1900.07;

        System.out.printf("%+.1f\n", price4);
        System.out.printf("%,.2f\n", price5);
        System.out.printf("%(.3f\n", price6);
        System.out.printf("% .4f\n", price7);

        //----------------[width]----------------//

        // 0 = zero padding;
        // number = right justified padding;
        // negative number = left justified padding;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
