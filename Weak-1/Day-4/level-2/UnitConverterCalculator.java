public class UnitConverterCalculator {
    //declear double type final verible, this type of veriable can't change 
    public static final double yardToFeet = 3.0;
    public static final double feetToYard = 1.0 / YardToFeet; 
    public static final double meterToInches = 39.3701;
    public static final double inchesToMeter = 1.0 / meterToInches;
    public static final double inchesToCm = 2.54;
    //convert Yards To Feet
    public static double convertYardsToFeet(double yards) {
        return yards * yardToFeet;
    }
   //convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        return feet * feetToYard;
    }
   //convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * meterToInches;
    }
    
    public static double convertInchesToMeters(double inches) {
        return inches * inchesToMeter;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * inchesToCm;
    }
    public static void main(String[] args) {
        double yards = 10.0;
      //create variable type double yard and take some value
        double feet = UnitConvertor.convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        //take value meters 
        double meters = 2.0;
        double inches = UnitConvertor.convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches."); 
    }
}