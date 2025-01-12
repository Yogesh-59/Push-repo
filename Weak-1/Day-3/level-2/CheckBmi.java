import java.util.Scanner;
public class CheckBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //take input number of person
        int numOfPerson = sc.nextInt();
       // create array height, weight, bmi ans status from double type 
        double[] height = new double[numOfPerson];
        double[] weight = new double[numOfPerson];
        double[] bmi = new double[numOfPerson];
        String[] status = new String[numOfPerson];
        //using for loop to take input array
        for (int i = 0; i < numOfPerson; i++) {
            System.out.print("Give height in meters for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            System.out.print("Take weight in kilograms for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            // calculate bmi from weight and height
            bmi[i] = weight[i] / (height[i] * height[i]);
           //check bmi weather their value is lie
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
       // print final status of persons
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numOfPerson; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}