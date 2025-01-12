import java.util.Scanner;
public class SamAverageMark{
 public static void main(String[]args){
  //taking the marks of every subject like Math, Physics and Chemistry
   int markInMaths= 94;
   int markInPhysics=95;
   int markInChemistry= 96;
   // Calculate the average marks of both subject
   double average=(double)(markInMaths + markInPhysics + markInChemistry)/3;
   // Print the average marks of Sam
    System.out.println("Sam’s average mark in PCM is:"+average);
   }
}