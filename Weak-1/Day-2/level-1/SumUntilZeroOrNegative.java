import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double total = 0.0; 
        while (true) {  
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = scanner.nextDouble();  // Read user input
            
            if (number <= 0) {  
               // If the user enters 0 or a negative number
                break;  
              // Exit the loop
            }
            
            total += number; 
            // Add the number to the total
        }
        
        System.out.println("The total sum is: " + total);  
    }
}
