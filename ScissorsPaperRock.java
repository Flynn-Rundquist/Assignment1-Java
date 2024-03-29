/*
 * This program plays rock, paper, scissors against the user.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-06
 */
import java.util.Random;
import java.util.Scanner;

/**
 * Utility class for playing the game Scissors Paper Rock.
 */
final class ScissorsPaperRock {
    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private ScissorsPaperRock() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the game.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        final String[] options = {"Rock", "Paper", "Scissors"};

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Choose rock, paper, or scissors (1-3):");
        final int userChoice = scanner.nextInt() - 1;

        final Random random = new Random();
        final int computerChoice = random.nextInt(options.length);

        if (userChoice >= 0 && userChoice < options.length) {
            System.out.println("You selected: " + options[userChoice]);
            System.out.println("Computer selected: " + options[computerChoice]);
            if (userChoice == computerChoice) {
                System.out.println("Draw!");
            } else if (
                    userChoice == 0 && computerChoice == 2
                    ||
                    userChoice == 1 && computerChoice == 0
                    ||
                    userChoice == 2 && computerChoice == 1
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
