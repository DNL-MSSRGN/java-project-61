package hexlet.code.game;

import static hexlet.code.Engine.numberOfQuestions;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.RandomNumber.random;

public class Prime {
    public static void startPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswers = new String[numberOfQuestions][2];
        for (var questionAnswer : questionAndAnswers) {
            int max = 100;
            var randomNumber = random(1, max);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = checking(randomNumber);
        }
        startEngine(questionAndAnswers, question);

    }
    public static String checking(int x) {
        if (x == 2) {
            return "yes";
        }
        if (x % 2 == 0 || x < 2) {
            return "no";
        }
        return checkingPrime(x);
    }
    public static String checkingPrime(int x) {
        int divider = 3;
        for (var i = divider; i * i <= x; i += 2) {
            if (x % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
