import java.util.*;
 public class  SimpleIntrestCalculator{
   //make function Simple Intrest 
   static double SimpleIntrest(double principal, double rate, double time){
    //calculating intrest of given principle
     double interest =(principal*rate*time)/100;
     return interest;
  }
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    //take user input principle, rate , time
   double principal=sc.nextDouble();
   double rate=sc.nextDouble();
   double time=sc.nextDouble();
      // add the interest to principle
      double interest=SimpleIntrest(principal,rate,time);
     System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f%n", interest, principal, rate, time);

   }
 }