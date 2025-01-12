import java.util.Random;

public class ZaraBonus {
   //method to get employee data
    public static int[][] getEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][3]; 
         // creat 2-d array and in array 3 columns employee ID, salary, years of service
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = i + 1; // Employee ID
            employeeData[i][1] = rand.nextInt(90000) + 10000; 
             // random salary between 10000 and 99999
            employeeData[i][2] = rand.nextInt(10) + 1; 
          // random years of service between 1 and 10
        }

        return employeeData;
    }

    public static int[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int[][] updatedData = new int[employeeData.length][4]; // 4 columns: employee ID, old salary, new salary, bonus

        for (int i = 0; i < employeeData.length; i++) {
            updatedData[i][0] = employeeData[i][0]; // Employee ID
            updatedData[i][1] = employeeData[i][1]; // Old salary

            if (employeeData[i][2] > 5) {
                updatedData[i][3] = (int) (employeeData[i][1] * 0.05); // 5% bonus
            } else {
                updatedData[i][3] = (int) (employeeData[i][1] * 0.02); // 2% bonus
            }

            updatedData[i][2] = employeeData[i][1] + updatedData[i][3]; // New salary
        }

        return updatedData;
    }

    public static void displayResults(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        System.out.println("Employee ID\tOld Salary\tNew Salary\tBonus");
        for (int[] employee : updatedData) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\n", 
                    employee[0], employee[1], employee[2], employee[3]);
            totalOldSalary += employee[1];
            totalNewSalary += employee[2];
            totalBonus += employee[3];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees

        int[][] employeeData = getEmployeeData(numEmployees);
        int[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayResults(updatedData);
    }
}