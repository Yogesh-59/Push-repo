import java.util.Scanner;
public class StudentVoteChecker {
    //create method boolean type to return the true or false
    public static boolean studentVote(int age) {
      //check the student age
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
            return false;
        }
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // make Array to store the student ages
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            //take user input as their ages
        }

        for (int i = 0; i < 10; i++) {
         //check the given number of student can vote or not
            if (studentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}