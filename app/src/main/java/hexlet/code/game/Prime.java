package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];

        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = IsPrime(randomNumber)  ? "yes" : "no";
        }
        return questionAndAnswers;

    }


    public static boolean IsPrime(int x) {
        final int divider = 3;
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0 || x < 2) {
            return false;
        } else {
            for (var i = divider; i * i <= x; i += 2) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void runGame() {
        startEngine(generateRoundData(), QUESTION);
    }
}
