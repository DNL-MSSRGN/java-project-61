package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class GCD {
    static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static String[][] gcd() {

        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {
            var randomNumberX = random(1, MAX);
            var randomNumberY = random(1, MAX);

            questionAnswer[0] = Integer.toString(randomNumberX) +  " " + Integer.toString(randomNumberY);

            questionAnswer[1] = Integer.toString(gcd(randomNumberX, randomNumberY));
        }
        return questionAndAnswers;

    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static void startGCD() {
        startEngine(gcd(), QUESTION);
    }
}

