package hexlet.code.game;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class Even {
    static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = checkEven(randomNumber);
        }
        return questionAndAnswers;

    }
    public static void runGame() {
        startEngine(generateRoundData(), QUESTION);
    }
    public static String yesOrNo(boolean trueAnswer) {
        return trueAnswer ? "yes" : "no";
    }
    public static String checkEven(int randomNumber) {
        return yesOrNo(randomNumber % 2 == 0);
    }
}
