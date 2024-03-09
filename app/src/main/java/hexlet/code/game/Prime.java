package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;

import static hexlet.code.Engine.startEngine;

import static hexlet.code.RandomNumber.random;
import static hexlet.code.YesOrNo.yesOrNo;

public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[][] prime() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = yesOrNo(checking(randomNumber));
        }
        return questionAndAnswers;

    }
    public static boolean checking(int x) {
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0 || x < 2) {
            return false;
        }
        return checkingPrime(x);
    }
    public static boolean checkingPrime(int x) {
        final int divider = 3;
        for (var i = divider; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startPrime() {
        startEngine(prime(), QUESTION);
    }
}
