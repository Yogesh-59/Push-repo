import java.util.Scanner;
public class NumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take input from the user as number
        int number = input.nextInt();
        //using if, else to find out the number is positive, negative and zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else { 
            System.out.println("zero");
        }
    }
}