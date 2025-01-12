import java.util.Scanner;

public class LineEquation {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // array to store slope and y-intercept

        if (x1 == x2) {
            // Handle vertical line (slope is undefined)
            result[0] = Double.POSITIVE_INFINITY; // represent undefined slope
            result[1] = Double.NaN; // y-intercept is not defined
        } else {
            // Calculate slope
            result[0] = (y2 - y1) / (x2 - x1);

            // Calculate y-intercept
            result[1] = y1 - result[0] * x1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        if (Double.isInfinite(lineEquation[0])) {
            System.out.println("The line is vertical.");
        } else {
            System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        }

        scanner.close();
    }
}