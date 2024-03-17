package hexlet.code.game;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static int X;
    private static int Y;
    private static char OPERATORS;

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {

            questionAnswer[1] = String.valueOf(calculate());
            questionAnswer[0] = Integer.toString(X) + " " + OPERATORS + " " + Integer.toString(Y);;
        }
        return questionAndAnswers;
    }
    public static int calculate() {
        X = random(1, MAX);
        Y = random(1, MAX);
        var randomNumber = (int) (Math.random() * NUMBEROFQUESTIONS) + 1;
        switch (randomNumber) {
            case 1 -> {
                OPERATORS = '*';
                return X * Y;
            }
            case 2 -> {
                OPERATORS = '-';
                return X - Y;
            }
            case NUMBEROFQUESTIONS -> {
                OPERATORS = '+';
                return X + Y;
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
