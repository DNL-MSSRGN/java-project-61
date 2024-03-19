package hexlet.code.game;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Even {
    static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = checkEven(randomNumber) ? "yes" : "no";
        }
        return questionAndAnswers;

    }


    public static void runGame() {
        startEngine(generateRoundData(), QUESTION);
    }


    public static boolean checkEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
