import java.util.Scanner;
public class SalaryBonusCalculator{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        //creat array in double type and provide there size
        double[] salary = new double[10];
        double[] yearOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        // make three variable that initialize with zero
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        int i = 0;
        // take while loop weather condition is true and i is less than 10
        while (i < 10) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double tempSalary = sc.nextDouble();
            // check the salary is valid or not
            if (tempSalary <= 0) {
                System.out.println("Invalid salary please enter a positive value.");
                continue; 
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double tempYearOfService = sc.nextDouble();
            //check given year is valid
            if (tempYearOfService < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative value.");
                continue; 
            }

            salary[i] = tempSalary;
            yearOfService[i] = tempYearOfService;
            i++;
        }
        for (i = 0; i < 10; i++) {
            if (yearOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        for (i = 0; i < 10; i++) {
            System.out.printf("%.2f\n", i + 1, salary[i], yearOfService[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

   }
}