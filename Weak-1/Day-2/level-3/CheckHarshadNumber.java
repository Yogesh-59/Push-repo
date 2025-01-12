import java.util.Scanner;
public class CheckHarshadNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else if (number == 0) {
            System.out.println("0 is considered a Harshad number."); // Special case
        } else {
            int originalNumber = number;
            int sumOfDigits = 0;

            while (originalNumber != 0) {
                int lastDigit = originalNumber % 10;
                sumOfDigits += lastDigit;
                originalNumber /= 10;
            }

            if (sumOfDigits == 0) {
                System.out.println(number + " is not a Harshad number (division by zero).");
            } else if (number % sumOfDigits == 0) {
                System.out.println(number + " is a Harshad number.");
            } else {
                System.out.println(number + " is not a Harshad number.");
            }
        }
    }
}