public class NumberCheckerThree {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int lastDigits = number;

        while (lastDigits > 0) {
            if (square % 10 != lastDigits % 10) {
                return false;
            }
            square /= 10;
            lastDigits /= 10;
        }

        return true;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 9; // Example number

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        if (isNeon(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }

        if (isSpy(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        if (isBuzz(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }
    }
}