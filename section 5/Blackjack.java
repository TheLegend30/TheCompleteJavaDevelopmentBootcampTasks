import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();
        int yourFirst = drawRandomCard();
        int yourSecond = drawRandomCard();
        System.out.println("\n You get a \n" + cardString(yourFirst) + "\n and a \n" + cardString(yourSecond));

        int yourTotalValue = Math.min(yourFirst, 10) + Math.min(yourSecond, 10);
        System.out.println("your total is: " + yourTotalValue);

        int dealerFirst = drawRandomCard();
        int dealerSecond = drawRandomCard();
        System.out.println(
                "The dealer shows \n" + cardString(dealerFirst) + "\nand has a card facing down\n" + faceDown());

        int dealerTotalValue = Math.min(dealerFirst, 10) + Math.min(dealerSecond, 10);
        System.out.println("\nThe dealer's total is hidden");

        while (true) {
            String answer = hitOrStay();
            if (answer.equals("hit")) {
                int yourNewCard = drawRandomCard();
                yourTotalValue += Math.min(yourNewCard, 10);
                System.out.println("\nYou get a \n " + cardString(yourNewCard));
                System.out.println("your new total is " + yourTotalValue);
                if (yourTotalValue > 21) {
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
            } else {
                System.out.println("\nDealer's turn");
                System.out.println("\nThe dealer's cards are \n " + cardString(dealerFirst) + " \n and a \n "
                        + cardString(dealerSecond));
                System.out.println("\nDealer's total is " + dealerTotalValue);
                while (dealerTotalValue < 17) {
                    int dealerNewCard = drawRandomCard();
                    dealerTotalValue += Math.min(dealerNewCard, 10);
                    System.out.println("\nDealer gets a \n " + cardString(dealerNewCard));
                    System.out.println("\nDealer's total is " + dealerTotalValue);
                    if (dealerTotalValue > 21) {
                        System.out.println("Bust! Dealer loses");
                        System.exit(0);
                    }
                }
                if (yourTotalValue > dealerTotalValue) {
                    System.out.println("Player wins!");
                } else {
                    System.out.println("Dealer wins!");
                }
                break;
            }
        }

        // For tasks 9 to 13, see the article: Blackjack Part II.
        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     *
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */

    public static int drawRandomCard() {
        int randomNumber = (int) (Math.random() * 13 + 1);
        return randomNumber;
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     *
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */

    public static String cardString(int number) {
        String card = "";
        switch (number) {
            case 1:
                card = "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
                break;
            case 2:
                card = "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
                break;
            case 3:
                card = "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
                break;
            case 4:
                card = "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
                break;
            case 5:
                card = "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
                break;
            case 6:
                card = "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
                break;
            case 7:
                card = "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
                break;
            case 8:
                card = "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                break;
            case 9:
                card = "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
                break;
            case 10:
                card = "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                break;
            case 11:
                card = "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
                break;
            case 12:
                card = "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
                break;
            case 13:
                card = "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
                break;
            default:
        }
        return card;
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     *
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */

    public static String hitOrStay() {
        String answer = "";
        System.out.println("Hit or stay?");
        answer = scan.nextLine();
        while (!answer.equals("hit") && !answer.equals("stay")) {
            System.out.println("Please write 'hit' or 'stay'");
            answer = scan.nextLine();
        }
        return answer;
    }
}
