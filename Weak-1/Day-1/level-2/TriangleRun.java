import java.util.Scanner;
public class TriangleRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking user input
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert the target distance to meter
        double targetDistance = 5*1000;

        // Calculate the number of rounds
        double rounds = targetDistance / perimeter;
        System.out.printf("The total number of rounds the athlete will run is "+ rounds);
    }
}