public class NumberCheckerFour {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int productOfCubesOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number, int[] factors) {
        return sumOfFactors(factors) == number;
    }

    public static boolean isAbundantNumber(int number, int[] factors) {
        return sumOfFactors(factors) > number;
    }

    public static boolean isDeficientNumber(int number, int[] factors) {
        return sumOfFactors(factors) < number;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 6; // Example number

        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        if (isPerfectNumber(number, factors)) {
            System.out.println(number + " is a perfect number.");
        } else if (isAbundantNumber(number, factors)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is a deficient number.");
        }

        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}