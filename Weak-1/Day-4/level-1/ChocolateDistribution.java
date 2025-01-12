import java.util.Scanner;
public class ChocolateDistribution {
   // creating method for find out the quotient and modulo
     public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] array = new int[2]; //create array size of 2 to store the quotient and remaider
        array[0] = number % divisor; 
        array[1] = number / divisor;
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take user input
        int numberOfChocolate = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        //make result array 
        int[] result = findRemainderAndQuotient(numberOfChocolate, numberOfChildren);
        // print the result that is show number of chocolates get each child
        System.out.println("Each child gets " + result[1] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[0]);
    }
}