package hexlet.code.game;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static int RANDOMX;
    private static int randomY;
    private static char OPERATOR;

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];

        for (var questionAnswer : questionAndAnswers) {

            questionAnswer[1] = String.valueOf(calculate());
            questionAnswer[0] = Integer.toString(RANDOMX)
                    + " " + OPERATOR + " "
                    + Integer.toString(randomY);
        }
        return questionAndAnswers;
    }
    public static int calculate() {
        RANDOMX = random(1, MAX);
        randomY = random(1, MAX);
        var randomNumber = (int) (Math.random() * NUMBEROFQUESTIONS) + 1;
        switch (randomNumber) {
            case 1 -> {
                OPERATOR = '*';
                return RANDOMX * randomY;
            }
            case 2 -> {
                OPERATOR = '-';
                return RANDOMX - randomY;
            }
            case NUMBEROFQUESTIONS -> {
                OPERATOR = '+';
                return RANDOMX + randomY;
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
