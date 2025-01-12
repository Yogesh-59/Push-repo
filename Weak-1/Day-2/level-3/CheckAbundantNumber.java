import java.util.Scanner;
public class CheckAbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //check weather the given number is greater than zero and it should not non-negative
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sumOfDivisors = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            if (sumOfDivisors > number) {
                System.out.println(number + " is an abundant number.");
            } else {
                System.out.println(number + " is not an abundant number.");
            }
        }
    }
}