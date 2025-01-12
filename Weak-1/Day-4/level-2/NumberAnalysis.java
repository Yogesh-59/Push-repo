import java.util.Scanner;
public class NumberAnalysis {
    //create method boolean type to check given number positive
    public static boolean isPositive(int number) {
        return number > 0;
    }
    //method to check is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
     // method to check comparision of two number
    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is less
        } else {
            return 0; // num1 is equal to num2
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive ");
                if (isEven(numbers[i])) {
                    System.out.println("and even.");
                } else {
                    System.out.println("and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int comparisonResult = compareNumbers(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == -1) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First element is equal to the last element.");
        }
    }
}