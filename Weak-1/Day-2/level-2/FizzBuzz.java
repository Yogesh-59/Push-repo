import java.util.Scanner;
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //check the given number is greater than zero or not
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            for (int i = 1; i <= number; i++) {
                    // Check for multiples of both 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) { 
                    System.out.println("FizzBuzz");
      
                } // Then check for multiples of 3
                  else if (i % 3 == 0) { 
                    System.out.println("Fizz");
                } // Then check for multiples of 5
                   else if (i % 5 == 0) { 
                    System.out.println("Buzz");
                } 
                      else { 
                      // If none of the above are true, print the number
                    System.out.println(i);
                }
            }
        }
    }
}