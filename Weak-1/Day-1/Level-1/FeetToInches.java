import java.util.Scanner;
public class FeetToInches{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    // take the height as user input
    double height=sc.nextDouble();
    // the 1 foot is equal to 30.48 cm
    double heightInFeet= height/30.48;
    // 1 inch is equal to 2.54 cm
    double heightInInches= height/2.54;
    System.out.println("Your Height in cm is "+height+" while in feet is "+heightInFeet+" and inches is "+heightInInches);
   }

}