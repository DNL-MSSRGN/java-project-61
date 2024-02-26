package hexlet.code.game;

import static hexlet.code.Engine.startEngine;
import static hexlet.code.RandomNumber.random;

public class Progression {
    public static void startProgression() {
        String question = "What number is missing in the progression?";
        var numberOfQuestions = 3;
        String[][] questionAndAnswers = new String[numberOfQuestions][2];
        for (var questionAnswer : questionAndAnswers) {
            int intervalMin = 2;
            int intervalMax = 10;
            var interval = random(intervalMin, intervalMax);
            int lengthMin = 5;
            int lengthMax = 10;
            var length = random(lengthMin, lengthMax);
            int max = 100;
            var randomNumber = random(1, max);
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
