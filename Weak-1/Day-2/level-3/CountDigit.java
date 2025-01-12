import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            int temp = Math.abs(number); 
            // use a temporary variable and handle negative numbers

            while (temp != 0) {
                temp /= 10; 
                count++;    
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);
    }
}