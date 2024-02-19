package hexlet.code;

import static hexlet.code.Even.even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plea1se enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);

        if (choice == 1){
            even();

        }
        if (choice == 2){
            even();
        }


        scanner.close();

    }
}
