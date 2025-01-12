import java.util.Scanner;
public class TrigonometricFunction {
    // create method to calculate Trigonometric Functions
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double[] results = new double[3];
        //create Array results is double type
        // converting degrees to radians using Math function
        double angleInRadians = Math.toRadians(angleInDegrees);

        // calculating sine, cosine, and tangent
        results[0] = Math.sin(angleInRadians);
        results[1] = Math.cos(angleInRadians);
        results[2] = Math.tan(angleInRadians);

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angleInDegrees = sc.nextDouble();
        // taking user input as angle in degrees
        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}