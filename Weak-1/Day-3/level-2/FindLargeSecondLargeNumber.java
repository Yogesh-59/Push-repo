import java.util.Scanner;
public class FindLargeSecondLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take user input as number
        int number = sc.nextInt();
        // create variable maxDigit and take their value is 10 given in problem
        int maxDigit = 10;
       // create the array name is digit and take their size is 10 
        int[] digit = new int[maxDigit]; 
        int index = 0;
        //run while loop until number is not zero
        while (number != 0) {
            if (index == maxDigit) { 
                maxDigit += 10;
                int[] temp = new int[maxDigit]; 
               //use arraycopy to increasing the size of array
                System.arraycopy(digit, 0, temp, 0, index); 
                digit = temp; 
            }
            digit[index] = number % 10; 
            number /= 10;
            index++;
        }
       // finding large and second large element in given number
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