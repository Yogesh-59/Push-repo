import java.util.Scanner;
public class ComparisonOfFriend {
     // make method to get friend name by index
    private static String getFriendName(int index) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        return names[index];
    }

    // method to find the index of the youngest friend
    private static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // method to find the index of the tallest friend
    private static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //make array to get ages from three friend
        int[] ages = new int[3];
        System.out.println("Enter ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
        }

        // Create Array to get heights of friends
        double[] heights = new double[3];
        System.out.println("Enter heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            heights[i] = scanner.nextDouble();
        }

        // Finding youngest friend
        int youngestIndex = findYoungest(ages);
        String youngestName = getFriendName(youngestIndex);
        System.out.println("Youngest friend: " + youngestName);

        // Finding tallest friend
        int tallestIndex = findTallest(heights);
        String tallestName = getFriendName(tallestIndex);
        System.out.println("Tallest friend: " + tallestName);
    }

    
}