package hexlet.code;

import java.util.Scanner;

public class Even {
    public static int random() {
        var a = 45;
        var c = 21;
        var m = 67;
        var seed = 50 * (Math.random() * 10);

        seed = (a * seed + c) % m;

        int seed1 = (int) seed;
        return seed1;
    }
    public static String question(){

        var question = random();
        var evenQuestion = question % 2;

        System.out.println("Question: " + question);

        return (evenQuestion == 0) ? "yes" : "no";
    }

    public static void even(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name? ");

        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0;i < 3;i++) {
            String question = question();

            String answer = scanner.next();

            System.out.println("Your answer: " + answer);

            if(question.equals(answer)){
                System.out.println("Correct!");
                if(i == 2){
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else{
                System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + question +  "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }


        }



    }
}
