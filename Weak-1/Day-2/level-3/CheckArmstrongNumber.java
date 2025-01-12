import java.util.Scanner;
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //check the given input is not less than zero or negative integer
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int originalNumber = number; 
            int sum = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10; 
                // get the last digit
                sum += remainder * remainder * remainder; 
                // cube the digit and add to the sum
                originalNumber /= 10; 
                    // remove the last digit
            }

            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
}