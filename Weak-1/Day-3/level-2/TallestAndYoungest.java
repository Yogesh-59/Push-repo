import java.util.Scanner;

public class TallestAndYoungest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creat array ages and take size is 3
        int[] ages = new int[3];
        // make another array heights to take heights input
        double[] heights = new double[3];
       // take input ages
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
        }
       // taking input heights
        for (int i = 0; i < 3; i++) {
            heights[i] = sc.nextDouble();
        }
        //finding young friend from their age gap
        int younFriend = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[younFriend]) {
                younFriend = i;
            }
        }
        //finding tallest friend 
        int tallFriend = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallFriend]) {
                tallFriend = i;
            }
        }
        // take string to their names
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Youngest friend: " + names[younFriend]);
        System.out.println("Tallest friend: " + names[tallFriend]);
    }
}