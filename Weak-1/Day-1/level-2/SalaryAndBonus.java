import java.util.Scanner;

public class SalaryAndBonus{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // take two varible as user input
        int salary=sc.nextInt();
        int bonus=sc.nextInt();
         // add the salary and bonus 
        int totalIncome= salary + bonus;
        System.out.printf("The salary is INR "+salary+ " and bonus is INR "+bonus+" hence Total income is INR "+ totalIncome);
    }
}