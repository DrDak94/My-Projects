import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        // .substring() = a method used to extract a portion of a string.
        // string.substring(start, end);

        Scanner scanner = new Scanner(System.in);

        String email = "fake123@gmail.com";
        String username = email.substring(0, 7);  // "fake123" 
        String domain = email.substring(8, 17);   // "gmail.com"

        String email2 = "fake12345@gmail.com";
        String username2 = email2.substring(0, email2.indexOf("@"));
        String domain2 = email2.substring(email2.indexOf("@") + 1);

        String email3;
        String username3;
        String domain3;

        System.out.println(username);
        System.out.println(domain);
        System.out.println(username2);
        System.out.println(domain2);

        System.out.print("Enter your email: ");
        email3 = scanner.nextLine();

        if(email3.contains("@")) {
            username3 = email3.substring(0, email3.indexOf("@"));
            domain3 = email3.substring(email3.indexOf("@") + 1);
    
            System.out.println(username3);
            System.out.println(domain3);
        } else {
            System.out.println("Invalid email! Must contain '@' symbol.");
        }

        scanner.close();
    }
}
