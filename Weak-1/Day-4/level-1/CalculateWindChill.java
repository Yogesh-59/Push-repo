import java.util.Scanner;
public class CalculateWindChill {
       // create method in double type to calculate wind chill temperature
       public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //take user input as temprature, windSpeed 
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
       //call the method calculateWindChill
        double windChill = calculateWindChill(temperature, windSpeed);
       // printing the final calculated wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + " °F");
    }

   
}