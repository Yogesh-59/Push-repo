import java.util.Scanner;
public class KilometerToMiles{
 public static void main(String[]args){
   // taking input from user to use the Scanner 
    Scanner sc=new Scanner(System.in);
    // the user want to take variable name is km
    double km=sc.nextDouble();
    // the 1 km is equal to 1.6 miles
    double distanceInMile= km*1.6;
    System.out.println(" The total miles is "+ distanceInMile +" mile for the given "+km+" km");
   }

}