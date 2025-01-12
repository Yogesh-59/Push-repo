import java.util.Scanner;

public class SwapTwoNumber{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // taking user input number1, number2
        int number1=sc.nextInt();
        int number2=sc.nextInt();
       // swap using third variable
        int num=number1;
        number1=number2;
        number2=num;
       System.out.println("The swapped number are "+number1+ " and "+number2);
  }
}