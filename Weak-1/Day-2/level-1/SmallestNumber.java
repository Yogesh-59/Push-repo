import java.util.Scanner;
public class SmallestNumber{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking the numbers from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        // Check if number1 is the smallest using if-else
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
        