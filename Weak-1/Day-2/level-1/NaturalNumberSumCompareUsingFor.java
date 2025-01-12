import java.util.Scanner;
public class NaturalNumberSumCompareUsingFor{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer (natural numbers start from 0 or 1)");
        } else {
            // Calculate sum using the formula
            long formulaSum = (long) n * (n + 1) / 2;

            // Calculate sum using a for loop
            long loopSum = 0;
            for (int i = 0; i <= n; i++) { 
              // Initialize i to 0
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct. The sums match.");
            } else {
                System.out.println("The computations do not match. There is an error."); 
            }
        }
    }
}
