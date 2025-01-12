import java.util.Random;
public class StudentGrades {
  //method to generate Random Scores
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Math
        }

        return scores;
    }
  //method to calculate Results
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // create Array and take 4 columns Total, Average, Percentage, Grade

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // round percentage to 2 decimal places
            results[i][3] = determineGrade(percentage); 
        }

        return results;
    }

    public static String determineGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "E (Level 1, too below agency-normalized standards)";
        } else {
            return "R (Remedial standards)";
        }
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\t\tRemarks");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.0f\t\t%.2f\t\t%.2f\t\t%s\n", 
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students

        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateResults(studentScores);
        displayScorecard(studentScores, studentResults);
    }
}