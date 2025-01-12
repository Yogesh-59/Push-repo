import java.util.*;
import java.util.Random;
public class FootballTeamStats {
    //method to generate Player Heights
    public static int[] generatePlayerHeights() {
        int[] heights = new int[11]; // create array to store heights of 11 players
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150; // generate random height between 150 and 250 cm
        }

        return heights;
    }
   //mrthod to calculate sum Of Heights
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
   // method to find mean of height
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length; 
    }
      //in this method to find shortest Height
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    //method to find tallest height
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] playerHeights = generatePlayerHeights();

        System.out.println("Player Heights (cm):");
        for (int height : playerHeights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Shortest Height: " + shortestHeight(playerHeights) + " cm");
        System.out.println("Tallest Height: " + tallestHeight(playerHeights) + " cm");
        System.out.println("Mean Height: " + meanHeight(playerHeights) + " cm");
    }
}