import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take the user input as number
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 
            // Use long to handle larger factorials
            int i = 1; 
            while (i <= number) {
                factorial *= i; 
                i++; 
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
