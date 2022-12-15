import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("- Select option 'a' to by a car");
        System.out.println("- Select option 'b' to sell car");

        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Zaporozhets is available for 10000 hryven");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 666) {
                        System.out.println("Sold! Finally that crap'll be removed from the store");
                    } else {
                        System.out.println("Get the heck out, weirdo");
                    }
                } else {
                    System.out.println("Get off, hobo");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();
                if (value > price && price < 30000) {
                    System.out.println("\nOk, I'll buy your tachanka");
                } else {
                    System.out.println("\nLol, I don't need this shiait");
                }
                break;
            default:
                System.out.println("invalid option");
        }

        scan.close();
    }
}
