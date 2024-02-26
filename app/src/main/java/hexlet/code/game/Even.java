package hexlet.code.game;


import static hexlet.code.Engine.startEngine;
import static hexlet.code.RandomNumber.random;

public class Even {

    public static void startEven() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswers = new String[3][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, 100);
            questionAnswer[0] = Integer.toString(randomNumber);

            questionAnswer[1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        startEngine(questionAndAnswers, question);

    }
}