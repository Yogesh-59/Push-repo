import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number == 1) {
            System.out.println("1 has no factors other than itself.");
        } else {
            int greatestFactor = 1; 
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; 
                      // Exit loop once the greatest factor is found
                }
            }
            System.out.println("The greatest factor of " + number + " (besides itself) is " + greatestFactor);
        }
    }
}