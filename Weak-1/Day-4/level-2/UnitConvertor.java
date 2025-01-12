import java.util.*;
public class UnitConvertor {
    public static final double KmToMiles = 0.621371;
    public static final double MilesToKm = 1.60934;
    public static final double MetersTOFeet = 3.28084;
    public static final double FeetToMeters = 0.3048;

    // converting kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KmToMiles;
    }

    // miles to kilometers conversion
    public static double convertMilesToKm(double miles) {
        return miles * MilesToKm;
    }

    // meters to feet conversion
    public static double convertMetersToFeet(double meters) {
        return meters * MetersTOFeet;
    }

    // Converting feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FeetToMeters;
    }
    public static void main(String[] args) {
        double km = 10.0;
        double miles = UnitConvertor.convertKmToMiles(km);
        System.out.println(km + " km is equal to " + miles + " miles.");
        //declear local veriable feet and give some value
        double feet = 100.0;
        double meters = UnitConvertor.convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}