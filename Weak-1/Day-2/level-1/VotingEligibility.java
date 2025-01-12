import java.util.Scanner;
public class VotingEligibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take user input as age 
        int age = input.nextInt();
        // check the age to this person is eligible for vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}