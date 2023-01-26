import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    static Random random = new Random();
    static String guessedWord = words[random.nextInt(0, words.length)];
    static StringBuilder misses = new StringBuilder();
    static Scanner scanner = new Scanner(System.in);
    static char[] placeholders = new char[words.length];

    public static void main(String[] args) {

        initializePlaceholders();

        char guess;
        int wrongGuesses = 0;

        while (true) {

            showGallows(wrongGuesses);
            if (wrongGuesses == 6) {
                System.out.println("RIP!");
                System.out.println("The word was " + guessedWord);
                break;
            }

            System.out.println("Word: ");
            showWord(placeholders);
            if (checkWin(placeholders)) {
                System.out.println("You win!");
                break;
            }

            System.out.println("Misses: " + misses.toString());
            do {
                System.out.print("Guess: ");
                guess = scanner.next().charAt(0);
            } while (misses.toString().indexOf(guess) != -1);
            if (!checkLetter(guess)) {
                wrongGuesses++;
            }

        }
    }

    public static void initializePlaceholders() {
        for (int i = 0; i < guessedWord.length(); i++) {
            placeholders[i] = '_';
        }
    }

    public static void showGallows(int guesses) {
        System.out.println(gallows[guesses]);
    }

    public static void showWord(char[] placeholders) {
        for (char c : placeholders) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static boolean checkLetter(char guess) {
        int index = guessedWord.indexOf(guess);
        if (index != -1) {
            for (int i = 0; i < guessedWord.length(); i++) {
                if (guessedWord.charAt(i) == guess) {
                    placeholders[i] = guess;
                }
            }
            return true;
        } else {
            misses.append(guess);
            return false;
        }
    }

    private static boolean checkWin(char[] placeholders) {
        for (char c : placeholders) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

}
