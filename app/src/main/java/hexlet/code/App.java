package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.game.Calc.startCalc;
import static hexlet.code.game.Even.startEven;
import static hexlet.code.game.GCD.startGCD;
import static hexlet.code.game.Prime.startPrime;
import static hexlet.code.game.Progression.startProgression;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plea1se enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String choice = scanner.nextLine();
        System.out.println("Your choice: " + choice);
        gameSelection(choice);
    }
    public static void gameSelection(String choice){
        switch (choice) {
            case "1" -> greet();
            case "2" -> startEven();
            case "3" -> startCalc();
            case "4" -> startGCD();
            case "5" -> startProgression();
            case "6" -> startPrime();
            default -> {
            }

        }
    }
}
