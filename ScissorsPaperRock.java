/*
 * This program plays rock, paper, scissors 
 * against the user.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-03-06
 */

import java.util.Scanner;
import java.util,Random;

public class ScissorsPaperRock {
  public static void main(String[] args) {
    //Array w/ options of rock, paper, or scissors
    String[] options = {"Rock", "Paper", "Scissors"};

    // Gets user input
    Scanner myObj = new Scanner(System.in); //Creates scanner object
    System.out.println("Choose rock (1), paper (2), or scissors(3): ")
    int userChoice = scanner.nextInt() - 1; //Subtract 1 because arrays start at 0
    System.out.println("You selected: " +options[userChoice]);

    // Gets computers selection
    Random random = new Random();
    int computerChoice = random.nextInt(options.length);

    // print computers choiec
    System.out.println("Computer selected: " +options[computerChoice]);

    if (userChoice < 3 && userChoice > 0 ) {
        if (userChoice === computerChoice) {
                System.out.println("Draw!");
        } else if (
                        (
    } else {
        System.out.println("Invalid input. Input a number between 1 and 3.")
