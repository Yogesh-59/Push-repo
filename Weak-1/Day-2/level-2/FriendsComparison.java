import java.util.Scanner;
public class FriendsComparison{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amarAge = input.nextInt();
        double amarHeight = input.nextDouble();
        int akbarAge = input.nextInt();
        double akbarHeight = input.nextDouble();
        int anthonyAge = input.nextInt();
        double anthonyHeight = input.nextDouble();

        if (amarAge < 0 || akbarAge < 0 || anthonyAge < 0 || amarHeight < 0 || akbarHeight < 0 || anthonyHeight < 0) {
            System.out.println("Error: Age and height must be non-negative values.");
   
            return;
        }

        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);

        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is " + youngestFriend + " (" + youngestAge + " years old).");
        System.out.printf("The tallest friend is " + tallestFriend + " (%.2f cm).\n", tallestHeight);

       
    }
}