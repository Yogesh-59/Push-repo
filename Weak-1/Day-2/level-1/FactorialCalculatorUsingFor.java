import java.util.Scanner;
public class FactorialCalculatorUsingFor {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      // take input from user
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 
          // Use long to handle larger factorials
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
