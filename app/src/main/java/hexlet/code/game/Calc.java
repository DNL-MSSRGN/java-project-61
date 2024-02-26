package hexlet.code.game;

import static hexlet.code.Engine.startEngine;
import static hexlet.code.RandomNumber.random;

public class Calc {
    public static void startCalc() {
        String question = "What is the result of the expression?";
        var numberOfQuestions = 3;
        String[][] questionAndAnswers = new String[numberOfQuestions][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumberX = random(1, 100);
            var randomNumberY = random(1, 100);
            var randomNumber = random(1, 3);
            String[] calc = randomCalc(randomNumberX,  randomNumberY,  randomNumber);
            questionAnswer[0] = Integer.toString(randomNumberX) + " " + calc[0] + " " + Integer.toString(randomNumberY);
            questionAnswer[1] = calc[1];
        }
        startEngine(questionAndAnswers, question);
    }
    public static String[] randomCalc(int x, int y, int randomNumber) {
        if (randomNumber == 1) {
            return new String[]{"+", Integer.toString(x + y)};
        }
        if (randomNumber == 2) {
            return new String[]{"-", Integer.toString(x - y)};
        }
        if (randomNumber == 3) {
            return new String[] {"*", Integer.toString(x * y)};
        }
        return new String[0];
    }
}
