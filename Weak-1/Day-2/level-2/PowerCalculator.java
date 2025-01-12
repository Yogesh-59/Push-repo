import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        // Use long to handle potentially large results
        long result = 1; 

        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
    }
}