import java.util.Scanner;
public class CountdownRocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for the countdown start value
        int counter = scanner.nextInt();

        // Validate that the input is a positive number
        if (counter <= 0) {
            System.out.println("Please enter a positive number for the countdown.");
        } else {
            System.out.println("\nStarting countdown:");

            // Use a while loop to count down from the given value to 1
            while (counter >= 1) {
                System.out.println(counter);
                counter--; // Decrement the counter
            }

            // Print launch message
            System.out.println("Liftoff! The rocket has launched!");
        }
    }
}
