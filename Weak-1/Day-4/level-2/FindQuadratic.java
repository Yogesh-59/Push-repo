import java.util.Scanner;

public class FindQuadratic {
   // method to find out roots
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            // two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots 
            return new double[0]; // return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // take user input a,b and c
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
       //call method find root
        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }
}