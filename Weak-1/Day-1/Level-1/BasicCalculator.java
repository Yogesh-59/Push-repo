import java.util.Scanner;
public class BasicCalculator{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    // take the user input number1 and number2
       float number1= sc.nextFloat();
       float number2= sc.nextFloat();
       // performing the all opration
       float addition= number1 + number2;
       float multiplication= number1 * number2;
       float subtraction= number1-number2;
        float division= number1/number2;
        //print the value of every opration
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+"and "+number2+" is"+addition+","+subtraction+","+multiplication+", and"+division);
    }

}