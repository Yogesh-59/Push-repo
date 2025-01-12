import java.util.Scanner;
public class SumIsNotZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declear the total and number
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum (enter 0 to finish):");
        //do-while loop is run at least one's if condition is not true
        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            total += number; // Add the number to the total
        } while (number != 0);

        System.out.println("The sum of the numbers is: " + total);
        
    }
}
