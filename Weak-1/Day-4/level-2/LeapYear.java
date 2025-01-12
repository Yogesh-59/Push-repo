import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year) {
        // check given year is within the gregorian calendar
        if (year < 1582) {
            System.out.println("Leap Year calculation is not valid before 1582.");
            return false;
        }
      //check given year is leap year or not
        boolean conditionA = (year % 4 == 0);
        boolean conditionB = (year % 100 != 0) || (year % 400 == 0);
      // return the given year is leap year with condition A and B
        return conditionA && conditionB;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //take user input
        int year = sc.nextInt();
        //call method to fine out is leap year or not
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}