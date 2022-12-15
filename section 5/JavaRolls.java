import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rolling Java. Type anything to start.");
    scan.nextLine();

    System.out.println("Great, here are the rules:\n");
    System.out.println("- If you roll a 6 the game stops.");
    System.out.println("- If you roll a 4 nothing happens.");
    System.out.println("- Otherwise, you get 1 point.\n");
    System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

    scan.nextLine();

    int score = 0;

    while (true) {
      int diceRoll = rollDice();
      System.out.print("You rolled a " + diceRoll + ". ");
      if (diceRoll == 6) {
        System.out.println("End of game.");
        break;
      } else if (diceRoll == 4) {
        System.out.println("Zero points. Keep rolling.");
      } else {
        System.out.println("One point. Keep rolling.");
        score++;
      }
      scan.nextLine();
    }

    System.out.println("\nYour score is: " + score);
    if (score > 3) {
      System.out.println("Wow, that's lucky. You win!");
    } else {
      System.out.println("Haha, loh");
    }

    scan.close();
  }

  /**
   * Task 4
   * Function name: rollDice – rolls a dice between 1 and 6
   *
   * @return randomNumber (int)
   *
   */

  public static int rollDice() {
    int randomNumber = (int) (Math.random() * 6 + 1);
    return randomNumber;
  }

}
