import java.util.Scanner;
public class CheckBmiIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // take user input of number of person
        int numOfPerson = sc.nextInt();
        //creating  multi-dimensional array to store height, weight, and Bmi 
        double[][] personData = new double[numOfPerson][3]; 
       // take string is weight status
        String[] weightStatus = new String[numOfPerson];
        for (int i = 0; i < numOfPerson; i++) {
            boolean validHeight = false;
           //while loop check valid height
            while (!validHeight) {
                System.out.print("Enter height in meters for person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble(); 
                if (personData[i][0] > 0) {
                    validHeight = true;
                } else {
                    System.out.println("Invalid height please enter a valid value.");
                }
            }
             //using while loop to take input person data
            boolean validWeight = false;
            while (!validWeight) {
                System.out.print("Enter weight in kilograms for person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) {
                    validWeight = true;
                } else {
                    System.out.println("Invalid weight please enter a valid value.");
                }
            }
            // calculating Bmi of given group of people
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
             //find out the Bmi status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
       // print the final bmi status
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numOfPerson; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t\t%s\n", 
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}