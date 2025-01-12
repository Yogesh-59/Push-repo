import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true; 

        if (number <= 1) {
            isPrime = false; 
              // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) { 
                if (number % i == 0) {
                    isPrime = false;
                    // Number is divisible by i, so it's not prime
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}