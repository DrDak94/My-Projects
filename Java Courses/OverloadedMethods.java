public class OverloadedMethods {
    public static void main(String[] args) {
        
        // Overloaded Methods = methods that share the same name but different parameters.
        // Signature = name + parameters.

        // Methods with the same name but different parameters:

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));

        //--------------------------------------------------------//

        // Let's bake a pizza:

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
        String pizza2 = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza2);
        String pizza3 = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza3);

    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
