import java.util.Scanner;
public class QuotientAndReminder{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
       // first step to take user input with using Scanner package
        int number1 =sc.nextInt();
        int number2 =sc.nextInt();
        // find out the quetient and mod
        int quotient= number1/number2;
        int reminder= number1%number2;
        System.out.println("The Quotient is "+quotient+" and reminder is "+reminder+" of two number "+number1+" and"+ number2);
      }

}