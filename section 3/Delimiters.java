import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        // int num = scanner.nextInt();

        System.out.println("Please write a sentence");
        scanner.nextLine();
        // String sentence = scanner.nextLine();

        scanner.close();
    }
}
