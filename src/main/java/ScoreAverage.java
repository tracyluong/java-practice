import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that asks the user to enter in
 * test scores and then displays the average score.
 *
 */
public class ScoreAverage {

    public static void main(String[] args) {

        List<Double> scores = new ArrayList<Double>();

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Validate the user's selection.
        double selection = 0;
        while (selection != -1) {
            System.out.print("Enter test score (-1 to exit): ");
            selection = keyboard.nextDouble();
            if (selection != -1) {
                scores.add(selection);
            }
        }

        // output average
        System.out.print("The average score is: " + averageScore(scores));

        keyboard.close();
    }

    static double averageScore(List<Double> scores) {
        double sum = 0;
        if (!scores.isEmpty()) {
            for (Double score : scores) {
                sum += score;
            }
            return sum / scores.size();
        }
        return sum;
    }


}