/*
 * This program plays rock, paper, scissors,
 * against the user
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2020-09-01
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Define options for the game
        String[] options = {"Rock", "Paper", "Scissors"};

        // Prompt the user to choose an option
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose rock, paper, or scissors:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Enter your choice (1-3): ");
        int userChoiceIndex = scanner.nextInt() - 1;

        // Print the user's selection
        System.out.println("Selected: " + options[userChoiceIndex]);

        // Generate a random selection for the computer
        Random random = new Random();
        int computerChoiceIndex = random.nextInt(options.length);

        // Print the computer's selection
        System.out.println("Computer selected: " + options[computerChoiceIndex]);

        // Determine the winner
        if (userChoiceIndex == computerChoiceIndex) {
            System.out.println("Draw!");
        } else if (
            (userChoiceIndex == 0 && computerChoiceIndex == 2) ||
            (userChoiceIndex == 1 && computerChoiceIndex == 0) ||
            (userChoiceIndex == 2 && computerChoiceIndex == 1)
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        System.out.println("\nDone.");
        scanner.close();
    }
}
