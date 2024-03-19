package hexlet.code.game;

import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static int randomX;
    private static int randomY;

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];

        for (var questionAnswer : questionAndAnswers) {

            randomX = random(1, MAX);
            randomY = random(1, MAX);
            var randomNumber = (int) (Math.random() * NUMBEROFROUNDS) + 1;
            char operator = choosingAnOperator(randomNumber);

            questionAnswer[1] = String.valueOf(calculate(randomX, randomY, operator));
            questionAnswer[0] = Integer.toString(randomX)
                    + " " + operator + " "
                    + Integer.toString(randomY);
        }
        return questionAndAnswers;
    }


    public static int calculate(int x, int y, char operator) {
        switch (operator) {
            case '*' -> {
                return randomX * randomY;
            }
            case '-' -> {
                return randomX - randomY;
            }
            case '+' -> {
                return randomX + randomY;
            }
            default -> {
                throw new RuntimeException("Unknown input");
            }
        }
    }


    public static char choosingAnOperator(int randomNumber) {
        switch (randomNumber) {
            case 1 -> {
                return  '*';
            }
            case 2 -> {
                return '-';
            }
            case NUMBEROFROUNDS -> {
                return '+';
            }
            default -> {
                throw new RuntimeException("Unknown input");
            }
        }
    }


    public static void runGame() {
        startEngine(generateRoundData(), QUESTION);
    }
}
