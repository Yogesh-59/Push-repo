import java.util.*;
public class RoundCalculator{
 // create method name is Possible Handshakes
  static double CalculateRound(double side1 , double side2, double side3){
   // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert the target distance to meter
        double targetDistance = 5*1000;

        // Calculate the number of rounds
        double rounds = targetDistance / perimeter;
   return rounds;
  }
 public static void main(String[]args){
   // taking user input as the three side of tringle
   Scanner sc= new Scanner(System.in);
        // taking user input
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        System.out.printf("The total number of rounds the athlete will run is " +CalculateRound(side1,side2,side3));
 }
}