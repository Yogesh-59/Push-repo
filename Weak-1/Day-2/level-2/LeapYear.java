import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {
            // Multiple if-else statements
            System.out.println("Using multiple if-else statements:");
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }

            //Single if statement with logical operators
            System.out.println("\nUsing a single if statement with logical operators:");
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}