import java.util.Scanner;
public class ChocolateDistribution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take the user input number of child and number of children
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
            // Calculate the number of chocolates each child gets
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;

            // Calculate the number of remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Display the results
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        }
}

      