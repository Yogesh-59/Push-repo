public class ExtendedNumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 10 possible digits (0-9)

        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i; // Digit
            frequencies[i][1] = 0; // Frequency
        }

        for (int digit : digits) {
            frequencies[digit][1]++;
        }

        return frequencies;
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

        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        if (isHarshadNumber(number, digits)) {
            System.out.println("The number is a Harshad number.");
        } else {
            System.out.println("The number is not a Harshad number.");
        }

        int[][] digitFrequencies = findDigitFrequencies(digits);
        System.out.println("Digit\tFrequency");
        for (int[] frequency : digitFrequencies) {
            System.out.println(frequency[0] + "\t" + frequency[1]);
        }
    }
}