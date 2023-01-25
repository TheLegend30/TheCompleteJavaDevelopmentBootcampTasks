import java.util.Random;

public class HighScore {
    public static void main(String[] args) {

        /**
         * Task 2
         *
         * 1. Create an array that stores 10 random numbers
         * 2. Using a for loop, print the array elements on the same line.
         * Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711
         * 32863 23707
         */

        int numbers[] = new int[10];
        System.out.print("Here are the scores: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber();
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int highScore = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (highScore < numbers[i]) {
                highScore = numbers[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        /**
         * Task 3
         * 
         * 1. Using a for loop, find the highest score in the array and update the
         * highScore.
         * 2. println("\n\nThe highest score is: <>. Give that man a cookie!");
         * 
         */

    }

    /**
     * Task 1
     * Function name – randomNumber
     * 
     * @return random number (int)
     * 
     *         Inside the function
     *         - returns a random number between 0 and 50000
     */
    static int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(50000);
        return number;
    }

}