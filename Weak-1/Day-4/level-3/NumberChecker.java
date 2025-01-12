import java.util.*;
public class NumberChecker {
    //method to count Digits from given number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    //in this method to store digits
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
  
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
        //method to check number is Armstrong Number or not
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int numDigits = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }
    // method to find largest digit
    public static int findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                largest = digit;
            }
        }
        return largest;
    }

    public static int findSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return secondLargest;
    }

    public static int findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                smallest = digit;
            }
        }
        return smallest;
    }

    public static int findSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int number = 153; // Example number

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        if (isDuckNumber(digits)) {
            System.out.println("The number is a duck number.");
        } else {
            System.out.println("The number is not a duck number.");
        }

        if (isArmstrongNumber(number, digits)) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        System.out.println("Largest digit: " + findLargest(digits));
        System.out.println("Second largest digit: " + findSecondLargest(digits));
        System.out.println("Smallest digit: " + findSmallest(digits));
        System.out.println("Second smallest digit: " + findSecondSmallest(digits));
    }
}