import java.util.Scanner;
public class OddEvenPrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Even numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
            // New line for better formatting

            System.out.println("Odd numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
