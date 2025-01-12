import java.util.Scanner;
public class PenDistribution{
 public static void main(String[]args){
   // Take the two variale name is totalPen and numerOfStudent
    int totalPen=14;
    int numberOfStudent=3;
    // find out the number of pen distributed in each student
    double penPerStudent=(double)(totalPen/numberOfStudent);
    // than calculate remaining pen 
    double remainingPen=(double)(totalPen % numberOfStudent);
    System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is :"+remainingPen);
   }
}