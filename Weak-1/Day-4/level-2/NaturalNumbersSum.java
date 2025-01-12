import java.util.Scanner;

public class NaturalNumbersSum {
    // create recursive method to find the sum of n natural numbers
    public static int recursiveSumOfNum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSumOfNum(n - 1);
        }
    }

    // create another Method to find the sum of n natural numbers using the formula
    public static int formulaSumofNum(int n) {
        return n * (n + 1) / 2;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take user input 
        int n = sc.nextInt();
        //check given number is greater than 0
        if (n <= 0) {
            System.out.println(" enter a natural number greater than 0.");
            return;
        }
        //call method to find sum using recursion and formula
        int recursiveSum = recursiveSumOfNum(n);
        int formulaSum = formulaSumofNum(n);
       //print the both recursive and formula sum
        System.out.println("Sum of " + n + " natural numbers using recursive: " + recursiveSum);
        System.out.println("Sum of " + n + " natural number using formula: " + formulaSum);
       // check the recursive sum and formula sum is equal or not
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match. Please check the implementation.");
        }
    }
}