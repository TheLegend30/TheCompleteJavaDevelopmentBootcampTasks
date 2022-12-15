import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int secretNumber = (int) (Math.random() * 5 + 1);

        int guess = scan.nextInt();
        while (guess != secretNumber) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("Yeah! You got it!");

        scan.close();
    }

}
