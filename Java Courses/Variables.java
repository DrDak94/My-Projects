public class Variables {
    public static void main(String[] args) {

        /* 2 Steps to create a variable
        -------------------------------
            1. declaration
            2. assignment
         */

        int age = 31;               // declaration of int (integer) variable and assignment;
        int year = 2025;
        int quantity = 1;

        System.out.println("My age is " + age);
        System.out.println("The year is " + year);
        System.out.println("The quantity is " + quantity);


        double price = 19.99;       // declaration of double (decimal) variable and assignment;  
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("The price is " + price);
        System.out.println("The gpa is " + gpa);
        System.out.println("The temperature is " + temperature);

        char grade = 'A';           // declaration of char (character) variable and assignment;
        char symbol = '!';
        char currency = '$';
        
        System.out.println("The grade is " + grade);
        System.out.println("The symbol is " + symbol);
        System.out.println("The currency is " + currency);

        boolean isStudent = false;  // declaration of boolean (true/false) variable and assignment;
        boolean isSenior = false;
        boolean forSale = false;

        System.out.println("I am a student: " + isStudent);
        System.out.println("I am a senior: " + isSenior);
        System.out.println("The item is for sale: " + forSale);

        if(isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        String name = "Davide";   // declaration of String (text) variable and assignment;
        String message = "Hello, " + name + "!";
        System.out.println(message);
        String email = "Davide@.fakemail.com";
        String message2 = "Your email is " + email;
        System.out.println(message2);
    }
}
