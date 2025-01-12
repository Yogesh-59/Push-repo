import java.util.Scanner;
public class FizzBuzzWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // take the input from user as number
        int number = input.nextInt();
        //check weather given number is greater than zero
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int i = 1; 
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // increment loop counter by one
            }
        }
    }
}