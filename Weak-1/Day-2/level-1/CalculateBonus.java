import java.util.Scanner;

public class CalculateBonus{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonusPercentage = 0.05; // 5% bonus
            double bonusAmount = salary * bonusPercentage;
            System.out.printf("The bonus amount is: "+ bonusAmount);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}