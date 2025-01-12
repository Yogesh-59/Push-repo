import java.util.Scanner;

public class CalendarGenerator {
     //method to create final string and put the all month's name in their string
    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    //in this method to put the day in month's
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  //method to get month name
    public static String getMonthName(int month) {
        if (month < 1 || month > 12) {
            return "Invalid Month";
        }
        return months[month - 1]; 
    }
   //method to find out days in month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
   //check the given year is leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
   // in this method to find first day of week
    public static int getFirstDayOfWeek(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; 
        return d0; // 0: Sunday, 1: Monday, ..., 6: Saturday
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfWeek(year, month);

        System.out.println("\n" + monthName + " " + year + "\n");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day of the month
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    "); 
        }

        // Display days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); 
            if ((day + firstDayOfWeek) % 7 == 0) {
                System.out.println(); 
            }
        }
    }
}