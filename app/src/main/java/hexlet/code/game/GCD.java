package hexlet.code.game;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumber.random;

public class GCD {
    public static void startGCD() {
        String question = "Find the greatest common divisor of given numbers.";
        var numberOfQuestions = 3;
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumberX = random(1, MAX);
            var randomNumberY = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumberX) +  " " + Integer.toString(randomNumberY);

            questionAnswer[1] = Integer.toString(gcd(randomNumberX, randomNumberY));
        }
        startEngine(questionAndAnswers, question);

    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
