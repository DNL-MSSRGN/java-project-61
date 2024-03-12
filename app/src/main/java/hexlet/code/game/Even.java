package hexlet.code.game;


import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class Even {
    static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] even() {
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = yesOrNo(randomNumber % 2 == 0);
        }
        return questionAndAnswers;

    }
    public static void startEven() {
        startEngine(even(), QUESTION);
    }
    public static String yesOrNo(boolean trueAnswer) {
        return trueAnswer ? "yes" : "no";
    }
}
