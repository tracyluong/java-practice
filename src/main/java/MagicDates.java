import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Write a program that asks the user to enter a date in mm/dd/yyyy format.
 * The program should then determine whether the day times the month
 * is equal to the year (two last digits); if so, it should display a
 * message indicating that the date is magic.
 */
public class MagicDates {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter date in mm/dd/yyyy format: ");
        String dateAsString = keyboard.next();

        keyboard.close();

        // Parse string to date
        LocalDate date = LocalDate.parse(dateAsString,
                DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // Check date and display output
        if (magicDate(date)) {
            System.out.println("This date is magic!");
        } else {
            System.out.println("Sorry, nothing magic about this date");
        }
    }

    // Check if a date is magic define by (month * date = last two digits of year)
    public static boolean magicDate(LocalDate date) {

        int month = date.getMonth().getValue();
        int day = date.getDayOfMonth();
        int year = date.getYear();

        String yearAsString = String.valueOf(year);
        String lastTwoDigits = "0";
        if (yearAsString.length() == 4) {
            lastTwoDigits = yearAsString.substring(2);
        }

        return (month * day) == Integer.parseInt(lastTwoDigits);
    }

}