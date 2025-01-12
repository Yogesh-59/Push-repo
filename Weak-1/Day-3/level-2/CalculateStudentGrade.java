import java.util.Scanner;
public class CalculateGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Sc(System.in);
        //take user input number of student
        int numStudents = scanner.nextInt();
        //create 2-D to store the marks of all three subject math, physics and chemistry
        int[][] studentMarks = new int[numStudents][3]; 
       // make double type array to use to store the float value of students percentage
        double[] percentages = new double[numStudents];
        //make char array to gtore grads
        char[] grades = new char[numStudents];
        // string array use to provide the student of remark base on there percentage
        String[] remarks = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            boolean validInput;
             //do-while loop use to validate the given marks is valid or not
            do {
                System.out.print("Enter physics marks for student " + (i + 1) + ": ");
                studentMarks[i][0] = sc.nextInt();
                validInput = studentMarks[i][0] >= 0;
                if (!validInput) {
                    System.out.println("Invalid marks. Please enter a positive value.");
                }
            } while (!validInput);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                studentMarks[i][1] = sc.nextInt();
                validInput = studentMarks[i][1] >= 0;
                if (!validInput) {
                    System.out.println("Invalid marks please enter a positive value.");
                }
            } while (!validInput);

            do {
                System.out.print("Enter maths marks for student " + (i + 1) + ": ");
                studentMarks[i][2] = sc.nextInt();
                validInput = studentMarks[i][2] >= 0;
                if (!validInput) {
                    System.out.println("Invalid marks please enter a positive value.");
                }
            } while (!validInput);
           //calculating percentage using the sum of all three subject
            percentages[i] = (studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2]) / 3.0;
          //check weather student percentage is good so base on there percent they get grads and remark
            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }
        //print the final grade and there percentage of grand total of all subject marks
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade\t\tRemarks");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%c\t\t%s\n", 
                    i + 1, studentMarks[i][0], studentMarks[i][1], studentMarks[i][2], 
                    percentages[i], grades[i], remarks[i]);
        }
    }
}