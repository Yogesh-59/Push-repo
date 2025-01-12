import java.util.Scanner;
public class FactorAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        // print the sum of factors, squares of factors and product of factor
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
    }

    public static int[] findFactors(int number) {
        // Determine the maximum possible number of factors (worst case: all numbers up to the number itself)
        int maxFactors = number; 
        int[] factors = new int[maxFactors];
        int count = 0; 

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }

        // create array with the exact size of the factors
        int[] actualFactors = new int[count];
        System.arraycopy(factors, 0, actualFactors, 0, count); 

        return actualFactors;
    }
    //in this method we have to find the sum of factor
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
     // create method to find out the sum Of Squares Of Factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += (int) Math.pow(factor, 2); 
        }
        return sumOfSquares;
    }
     //create method for calculate product Of Factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}