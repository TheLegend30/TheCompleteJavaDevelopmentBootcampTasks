import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What?",
                "Who?",
                "When?",
                "Where?",
                "Why?"
        };
        String[] answers = {
                "a. nus, b. ing, b. ang, o. right answer",
                "a. nus, b. ing, b. ang, e. right answer",
                "a. nus, b. ing, b. ang, u. right answer",
                "a. right answer, b. ing, b. ang, c. no",
                "a. right answer, b. ing, b. ang, c. just no"
        };
        String[] rightAnswers = { "o", "e", "u", "a", "a" };
        String[] yourAnswers = new String[rightAnswers.length];
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
            yourAnswers[i] = scanner.nextLine();
            if (yourAnswers[i].equals(rightAnswers[i]))
                score++;
        }
        System.out.println("Your score - " + score + "/" + questions.length);
        scanner.close();
    }
}
