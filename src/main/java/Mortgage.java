import java.util.Scanner;

/**
 * Write a program that computes loan payments.
 * The loan can be a car loan, a student loan,
 * or a home mortgage loan.
 *
 */
public class Mortgage {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter loan amount: ");
        double loanAmount = console.nextDouble();

        System.out.print("Enter number of years: ");
        int years = console.nextInt();

        System.out.print("Enter interest rate: ");
        double interestRate = console.nextDouble();
        System.out.println();

        console.close();

        // Call method for payment
        double payment = calculateMonthlyPayment(loanAmount, years, interestRate);

        // Output result
        System.out.println("Your loan payment = $" + (int) payment);
    }

    // Calculate monthly payment
    static double calculateMonthlyPayment(double loanAmount, int years,
                                          double interestRate) {

        int months = 12 * years;
        double c = interestRate / 12.0 / 100.0;
        double payment = loanAmount * c * Math.pow(1 + c, months)
                / (Math.pow(1 + c, months) - 1);

        return payment;
    }

}