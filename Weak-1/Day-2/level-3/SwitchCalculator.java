import java.util.Scanner;
public class SwitchCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        // take user input first
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next(); // Use next() to read a single word/token

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        double result = 0; // Initialize result

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit if division by zero
                }
                result = first / second;
                break;
            default:
                System.out.println("Invalid operator.");
                return; //Exit if invalid operator
        }

        System.out.println("Result: " + result);
    }
}