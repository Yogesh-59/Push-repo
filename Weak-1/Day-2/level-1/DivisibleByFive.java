import java.util.Scanner;
public class DivisibleByFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // take user input as number
        int number = input.nextInt();
        // check the given number is divisible five or not
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
  }
}
        