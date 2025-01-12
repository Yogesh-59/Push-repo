import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Handle cases where x1 == x2 or x2 == x3 to avoid division by zero
        if (x1 == x2) {
            return x3 == x1; // All x-coordinates are equal
        } else if (x2 == x3) {
            return false; // Different x-coordinates
        }

        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);
        double slope3 = (y3 - y1) / (x3 - x1);

        return Math.abs(slope1 - slope2) < 1e-9 && Math.abs(slope1 - slope3) < 1e-9; 
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9; // Allow for small numerical errors
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

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        scanner.close();
    }
}