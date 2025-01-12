import java.util.Scanner;
public class MultiplesBelow100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 1; i < 100; i++) { // Loop from 1 to 99
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}