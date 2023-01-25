import java.util.Scanner;

public class Grocer2 {
    public static void main(String[] args) {

        String[] store = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        // Task 1: Set up Scanner, and pick up the user's response.

        Scanner scanner = new Scanner(System.in);
        System.out.println("I want :");
        String answer = scanner.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(answer)) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }

        scanner.close();
    }
}
