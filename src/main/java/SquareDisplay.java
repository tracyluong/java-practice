import java.util.Scanner;

/**
 * Write a program that asks the user for a positive
 * integer no greater than 10. The program should then
 * draw a square on an output file using the asterisk "*".
 *
 */
public class SquareDisplay {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a number from the user.
        System.out.print("Enter a number between 1-10: ");
        int number = keyboard.nextInt();

        // Validate users input
        while (number < 1 || number > 10) {
            // Get a number from the user.
            System.out.print("Invalid number! Please enter an integer in the range of 1-10: ");
            number = keyboard.nextInt();
        }

        // Produce matrix
        outputMatrix("*", number);

        //close scanner
        keyboard.close();

    }


    // Display a row/column of char specified
    static void outputMatrix(String charToOutput, int number) {

        // display square made of char
        for (int row = 0; row < number; row++) {

            // display row
            for (int column = 0; column < number; column++) {
                System.out.print(charToOutput);
            }

            // Advance to the next line.
            System.out.println();
        }
    }

}