
        import java.util.Scanner;

        public class BmiCalculator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // taking user input 
                double weight = scanner.nextDouble();
    
                double heightInCm = scanner.nextDouble();
        
                // converting height into meters
                double heightInMeters = heightInCm / 100;
        
                // calculating BMI status
                double bmi = weight / (heightInMeters * heightInMeters);
                String status;
                if (bmi <= 18.4) {
                    status = "Underweight";
                } 
                else if (bmi <= 24.9) {
                    status = "Normal";
                } 
                else if (bmi <= 39.9) {
                    status = "Overweight";
                } 
                else {
                    status = "Obese";
                }
        
                //final output result
                System.out.println("\nResults:");
                System.out.printf("BMI: %.2f\n", bmi);
                System.out.println("Weight Status: " + status);
            }
        }
        
    
