import java.util.Scanner;
public class PoundsToKilogram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take input weight in pound from the user
        double weight = input.nextDouble();
        // convert the weight pouns into kilograms
        double weightInKilograms = weight / 2.2; 

        System.out.printf("The weight of the person in pound is "+weight+" and in kg is "+weightInKilograms);

       }
}

      