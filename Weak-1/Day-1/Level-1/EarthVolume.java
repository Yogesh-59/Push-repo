import java.util.Scanner;
public class EarthVolume{
 public static void main(String[]args){
    // firstly we have to take radius of earth
      double radiusOfEarth=6378;
      // take the PI value is 3.14
      double piValue=3.14;
      // calculate the cubic kilometers redius
      double cubicKilometers= ((4/3* piValue)* radiusOfEarth*radiusOfEarth*radiusOfEarth);
       double valueOfmile=1.6;
       // calculate the cubic miles redius
      double cubicMiles= ((4/3* piValue)* radiusOfEarth*radiusOfEarth*radiusOfEarth)*1.6;
      System.out.println("The volume of earth in cubic kilometers is "+	cubicKilometers+" and cubic miles is "+cubicMiles);
   }
}