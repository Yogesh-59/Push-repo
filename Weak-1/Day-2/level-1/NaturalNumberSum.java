import java.util.Scanner;
public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //taking user input of natural number
        int number = input.nextInt();
        // check weather given number is non-nagative
        if (number >= 0) { 
            long sum = (long) number * (number + 1) / 2; 
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}