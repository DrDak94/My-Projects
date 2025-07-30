public class Methods {
    public static void main(String[] args){

        // Method = a block of reusable code that is executed when called ().

        // Happy Birthday Song

        String name = "Davide";
        int age = 31;
        
        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        //--------------------------------------------------//

        // Square a number

        double result = square(9);
        System.out.println(result);

        System.out.println(square(5));

        //--------------------------------------------------//

        // Cube a number

        System.out.println(cube(5));

        //--------------------------------------------------//

        // Get Full Name

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        //--------------------------------------------------//

        // Age Check

        int age2 = 11;

        if(ageCheck(age2)){
            System.out.println("You may sign up!");
        } else{
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

