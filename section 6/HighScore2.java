public class HighScore2 {
    public static void main(String[] args) {
        int[] scores = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        int highScore = 0;
        int highScoreIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
                highScoreIndex = i;
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + " .Impressive");
        System.out.println("It's the gentleman is seat: " + highScoreIndex);
        /**
         * Task 1 – Find the person with the highest score
         * 
         * • After obtaining the highest score, print: The highest score is:
         * <highScore>. Impressive!
         * • It's the gentleman in seat: <index>. Give that man a cookie!
         * 
         */
    }

    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int) randomDouble;
        return randomInt;
    }
}
