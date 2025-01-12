import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        double  fahrenheit= scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double Celsius = (fahrenheit - 32 )* 5/9;

        // Print the result
        System.out.printf("The "+fahrenheit+ "fahrenheit is "+Celsius+" Celsius");
    }
}