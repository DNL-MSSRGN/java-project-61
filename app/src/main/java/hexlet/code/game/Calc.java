package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;

import static hexlet.code.Engine.startEngine;

import static hexlet.code.Utils.random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    public static String[] calc() {
        String[] questionAndAnswer = new String[2];
        var randomNumberX = random(1, MAX);
        var randomNumberY = random(1, MAX);
        var randomNumber = (int) (Math.random() * 3) + 1;

        String[] calc = randomCalc(randomNumberX,  randomNumberY,  randomNumber);

        questionAndAnswer[0] = Integer.toString(randomNumberX) + " " + calc[0] + " " + Integer.toString(randomNumberY);
        questionAndAnswer[1] = calc[1];

        return questionAndAnswer;
    }
    public static String[][] generate() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {

            String[] calc = calc();

            questionAnswer[0] = calc[0];
            questionAnswer[1] = calc[1];
        }
        return questionAndAnswers;
    }
    public static String[] randomCalc(int x, int y, int randomNumber) {
        switch (randomNumber) {
            case 1 -> {
                return new String[]{"*", Integer.toString(x * y)};
            }
            case 2 -> {
                return new String[]{"-", Integer.toString(x - y)};
            }
            case 3 -> {
                return new String[]{"+", Integer.toString(x + y)};
            }
            default -> {
                System.out.println("Некорректные данные!");
            }
        }

        return new String[0];
    }
    public static void startCalc() {
        startEngine(generate(), QUESTION);
    }
}
