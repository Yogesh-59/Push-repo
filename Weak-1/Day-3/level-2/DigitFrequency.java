import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // taking user input as number
        int number = sc.nextInt();
        int temp = number;
        //create temp variale and there value is equal to input value
        int count = 0;
      //use while loop to find the number of time given input is divisible by 10
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        //make digits array to store the count of every digit
        int[] digits = new int[count];
       //frequecy array are store the freq of each element
        int[] frequency = new int[10]; 
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++; 
        }
        //print the all digits frequency
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }
    }
}
