import java.util.Scanner;
public class FindFector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); 
        // the number is not less than zero
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("The factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) { 
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        }
    }
}