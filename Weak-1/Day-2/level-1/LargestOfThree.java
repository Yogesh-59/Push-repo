import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking number from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        //check the given number is greater than another given two number 
        boolean firstLargest= number1>= number2 && number1>=number3;// boolean is taking only true or false
        boolean secondLargest= number2>= number1 && number2>=number3;
        boolean thirdLargest= number3>= number1 && number3>=number2;
        // if the number is greater is another so print this number is greater and true
        if(firstLargest){
         System.out.println("\nIs the first number the largest? " + firstLargest);
        }
        else if(secondLargest){
         System.out.println("\nIs the second number the largest? " + secondLargest);
       }
        else{
         System.out.println("\nIs the third number the largest? " + thirdLargest);
      }
    }
}