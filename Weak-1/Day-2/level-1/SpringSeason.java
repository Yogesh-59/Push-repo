import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Not a spring season");
            return;
        }

        // Parse month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls within the Spring season
        boolean isSpringSeason = false;

         if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            isSpringSeason = true;
        }

        // Print the result
        if (isSpringSeason) {
            System.out.println("It’s a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
