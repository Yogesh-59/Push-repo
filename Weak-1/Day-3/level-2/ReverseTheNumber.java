import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take user input as number
        int number = sc.nextInt();
        //create temp variable that take the same value as number
        int temp = number;
        int count = 0;
        //check the temp is not equal to zero
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        //make array digit and their size is equal to count
        int[] digit = new int[count];
        int[] reverseDigit = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < count; i++) {
            reverseDigit[i] = digit[count - 1 - i];
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigit[i]);
        }
        System.out.println();
    }
}