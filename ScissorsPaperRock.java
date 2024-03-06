/**
 * This program plays rock, paper, scissors 
 * against the user.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-06
 */

import java.util.Random;
import java.util.Scanner;

public class ScissorsPaperRock {

    /**
     * Main method to run the game.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Array with options of rock, paper, or scissors
        String[] options = {"Rock", "Paper", "Scissors"};

        // Gets user input
        Scanner scanner = new Scanner(System.in); // Creates scanner object
        System.out.println("Choose rock, paper, or scissors (1-3):");
        int userChoice = scanner.nextInt() - 1; // Subtract 1 because arrays start at 0

        // Gets computer's selection
        Random random = new Random();
        int computerChoice = random.nextInt(options.length);

        if (userChoice >= 0 && userChoice < options.length) {
            System.out.println("You selected: " + options[userChoice]);
            System.out.println("Computer selected: " + options[computerChoice]);
            if (userChoice == computerChoice) {
                System.out.println("Draw!");
            } else if (
                    (userChoice == 0 && computerChoice == 2) ||
                            (userChoice == 1 && computerChoice == 0) ||
                            (userChoice == 2 && computerChoice == 1)
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else {
            System.out.println("Invalid input. Input a number between 1 and 3.");
        }
    }
}
