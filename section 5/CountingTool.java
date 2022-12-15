import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Timmy! Choose a number to count to: ");

        int number = scan.nextInt();

        System.out.println("Here it's");
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
