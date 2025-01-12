import java.util.*;
public class FindDayOfWeek{
    public static void main(String[] args) {
        // check the length of argument
        if (args.length != 3) {
            System.out.println(" Day Of Week <month> <day> <year>");
            return;
        }
        // ParseInt use to take command line argument

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date format. Month must be between 1 and 12, and day must be between 1 and 31.");
            return;
        }
        if(y<0){
            System.out.println("Year cannot be negative");
            return;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(d0 + " (" + days[d0] + ")");
    }
}