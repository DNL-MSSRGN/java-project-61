package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;

import static hexlet.code.Engine.startEngine;

import static hexlet.code.RandomNumber.random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    public static String[][] calc() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {
            var randomNumberX = random(1, MAX);
            var randomNumberY = random(1, MAX);
            var randomNumber = random(1, NUMBEROFQUESTIONS);

            String[] calc = randomCalc(randomNumberX,  randomNumberY,  randomNumber);

            questionAnswer[0] = Integer.toString(randomNumberX) + " " + calc[0] + " " + Integer.toString(randomNumberY);
            questionAnswer[1] = calc[1];
        }
        return questionAndAnswers;
    }
    public static String[] randomCalc(int x, int y, int randomNumber) {
        if (randomNumber == 1) {
            return new String[]{"+", Integer.toString(x + y)};
        }
        if (randomNumber == 2) {
            return new String[]{"-", Integer.toString(x - y)};
        }
        if (randomNumber == NUMBEROFQUESTIONS) {
            return new String[] {"*", Integer.toString(x * y)};
        }
        return new String[0];
    }
    public static void startCalc() {
        startEngine(calc(), QUESTION);
    }
}
