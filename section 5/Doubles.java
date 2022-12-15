public class Doubles {
    public static void main(String[] args) {

        /*
         * Task 2
         * 1. Call the rollDice() function twice.
         * 2. Store the return values in dice1 and dice2.
         *
         */
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }

        System.out.println("You rolled doubles!");
    }

    /**
     * Task 1
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
