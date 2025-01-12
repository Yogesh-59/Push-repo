import java.util.Scanner;
public class DistanceInMileAndYard{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
       double distanceInFeet= sc.nextDouble();
      //1 mile = 1760 yards and 1 yard is 3 feet
       double yard= distanceInFeet/3;
       double mile= distanceInFeet/(1760*3);
        System.out.println("The distance in feet is"+distanceInFeet+" and yard "+yard+" mile "+mile);
        }

}