public class StringMethods {
    public static void main(String[] args) {

        String name = "Davide Pinna";

        int length = name.length();           // Returns the length of the string.
        char letter = name.charAt(0);   // Returns the character at the specified index.
        int index = name.indexOf("i");    // Returns the index of the first occurrence of the specified character in this string.
        int lastIndex = name.lastIndexOf("i");

        // name = name.toUpperCase();         // Returns a copy of this string, converted to uppercase.
        // name = name.toLowerCase();         // Returns a copy of this string, converted to lowercase.
        // name = name.trim();                // Returns a copy of this string, with leading and trailing whitespace omitted.
        // name = name.replace("a", "u");     // Returns a copy of this string, with all occurrences of the specified character replaced by the specified character.

        // name.isEmpty();                    // Returns true if this string contains no characters.
        // name.contains("a");                // Returns true if this string contains the specified character.

        // name.equals("Davide Pinna");       // Returns true if this string is equal to the argument string.
        // name.equalsIgnoreCase("davide pinna"); // Returns true if this string is equal to the argument string, ignoring case differences.

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

    }
}
