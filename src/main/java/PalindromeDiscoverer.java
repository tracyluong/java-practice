import java.util.Scanner;

/**
 * Write program that accepts users input
 * and validates if the input is a palindrome.
 *
 */
public class PalindromeDiscoverer {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a word or phrase: ");
        String userInput = keyboard.nextLine();

        boolean isAPalindrome = isPalindrome(userInput);

        if (isAPalindrome) {
            System.out.print("This is a palindrome");
        } else {
            System.out.print("This is not a palindrome");
        }

        keyboard.close();
    }


    // Return true if a string is identified as a palindrome.
    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        } else {
            String toCompare = str.replaceAll("\\s+","");

            StringBuffer buffer = new StringBuffer(toCompare);
            String reversedString = buffer.reverse().toString();

            if (reversedString.equalsIgnoreCase(toCompare)) {
                return true;
            } else {
                return false;
            }
        }
    }

}