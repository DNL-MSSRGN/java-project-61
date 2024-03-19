package hexlet.code;
import hexlet.code.game.Calc;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import hexlet.code.game.Even;
import java.util.Scanner;
import static hexlet.code.Cli.greet;


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


    public static void gameSelection(String choice) {
        switch (choice) {
            case "1" -> greet();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> GCD.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            case "0" ->  System.out.println("Goodbye");
            default -> {
                System.out.println("You have entered incorrect data!");
            }

        }
    }
}
