import java.util.Scanner;
public class BmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; 
        //  create metrix 10 rows 3 columns

        // input weight and height for each member
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for member " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for member " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }

        // calculate Bmi for each member
        calculateBMI(data);

        // Bmi status for each member
        String[] status = BmiStatus(data);
        System.out.println("\nMember\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                    i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
    }

    // calculating Bmi for each member
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double heightMeters = data[i][1] / 100; // converting cm to meters
            data[i][2] = data[i][0] / (heightMeters * heightMeters); 
        }
    }

    // method to check Bmi status based on Bmi value
    public static String[] BmiStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] < 25) {
                status[i] = "Normal";
            } else if (data[i][2] >= 25 && data[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}