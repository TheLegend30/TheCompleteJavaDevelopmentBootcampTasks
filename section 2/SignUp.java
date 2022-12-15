import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        System.out.println("\nWhat is your surname?");
        String surname = scan.nextLine();
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        System.out.println("\nEnter your username");
        scan.nextLine();
        String username = scan.nextLine();
        System.out.println("\nFrom which city are you?");
        String city = scan.nextLine();
        System.out.println("\nWhat is your country?");
        String country = scan.nextLine();

        System.out.println("\nThank you for joining JavaGram!");

        System.out.println("\nFirst Name: " + name);
        System.out.println("Last Name: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);

        scan.close();
    }
}
