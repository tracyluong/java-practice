import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that generates a random number
 * and asks the user to guess what the number is.
 *
 */
public class GuessingGame {

    // Create a Random object.
    final static Random rand = new Random();

    // Max number is the upward bound number
    static final int maxNum = 10;

    public static void main(String[] args) {

        // Create variables to hold input in program
        int usersGuess;
        int randomNumber;
        int numberOfGuesses;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to guess a number
        System.out.println("Generated a number.");
        System.out.print("Guess what it is: ");
        usersGuess = keyboard.nextInt();

        // initialize number of guesses
        numberOfGuesses = 1;

        // get random number
        randomNumber = getRandomNumber();

        // Respond to the user's usersGuess.
        while (usersGuess != randomNumber) {

            if (usersGuess < randomNumber) {
                System.out.println("No, that's too low.");
            } else if (usersGuess > randomNumber) {
                System.out.println("No, that's too high.");
            }

            // Ask again
            System.out.print("Please guess again: ");
            usersGuess = keyboard.nextInt();

            // Increment the usersGuess counter.
            numberOfGuesses++;
        }

        // Output to user.
        System.out.println("Congratulations! You guessed it!");
        System.out.println("I generated this number:  " + randomNumber + ".");
        System.out.println("You got it right in " + numberOfGuesses + " guess(es).");

        keyboard.close();
    }

    // Return a random number within the upward bound max number.
    static int getRandomNumber () {
        return rand.nextInt(maxNum);
    }


}