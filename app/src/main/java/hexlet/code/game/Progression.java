package hexlet.code.game;

import static hexlet.code.Engine.*;
import static hexlet.code.RandomNumber.random;

public class Progression {

    static final int intervalMin = 3;
    static final int intervalMax = 10;

    static final int lengthMin = 5;
    static final int lengthMax = 10;

    public static void startProgression() {
        String question = "What number is missing in the progression?";
        var numberOfQuestions = 3;
        String[][] questionAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var interval = random(intervalMin, intervalMax);
            var length = random(lengthMin, lengthMax);
            var randomNumber = random(1, MAX);
            var hollow = random(1, length);

            String[] progression = generateProgression(interval, length, randomNumber);
            String answer = progression[hollow - 1];
            progression[hollow - 1] = "..";
            questionAnswer[0] = String.join(" ", progression);
            questionAnswer[1] = answer;

        }
        startEngine(questionAndAnswers, question);
    }
    public static String[] generateProgression(int interval, int length, int number) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(number + i * interval);
        }
        return progression;
    }
}
