package hexlet.code.game;

import static hexlet.code.Engine.startEngine;
import static hexlet.code.RandomNumber.random;

public class GCD {
    public static void startGCD() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswers = new String[3][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumberX = random();
            var randomNumberY = random();
            questionAnswer[0] = Integer.toString(randomNumberX) +  " " + Integer.toString(randomNumberY);

            questionAnswer[1] = Integer.toString(gcd(randomNumberX, randomNumberY));
        }
        startEngine(questionAndAnswers, question);

    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
