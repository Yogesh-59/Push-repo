import java.util.Scanner;

public class LargeSecondLargeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //takeing user input as number
        int number = sc.nextInt();
        int maxDigit = 10;
        //create array name digit and their size is 10
        int[] digit = new int[maxDigit]; 
        int index = 0;
        while (number != 0 && index < maxDigit) {
            digit[index] = number % 10; 
            number /= 10;
            index++;
        }
        //finding large and second large number
        int large = 0;
        int secondLarge = 0;
        for (int i = 0; i < index; i++) {
            if (digit[i] > large) {
                secondLarge = large;
                large = digit[i];
            } 
             else if (digit[i] > secondLarge && digit[i] != large) {
                secondLarge = digit[i];
            }
        }
        System.out.println("Largest digit: " + large);
        System.out.println("Second largest digit: " + secondLarge);
    }
}