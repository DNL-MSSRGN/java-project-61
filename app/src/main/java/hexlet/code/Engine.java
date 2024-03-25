package hexlet.code;
import java.util.Scanner;

import static java.lang.System.in;

public class Engine {
    public static final int NUMBEROFROUNDS = 3;
    public static void startEngine(String[][] questionAndAnswers, String question) {
        Scanner scanner = new Scanner(in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        for (var questionAnswer : questionAndAnswers) {
            System.out.println("Question: " + questionAnswer[0]);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(questionAnswer[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
