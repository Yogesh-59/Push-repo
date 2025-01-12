import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // Get user inputs
        String name = sc.nextLine();

        String fromCity = sc.nextLine();

        
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
      
        double fromToViaDistance = sc.nextDouble();

        double viaToFinalDistance = sc.nextDouble();
        double timeFromToVia = sc.nextDouble();
        double timeViaToFinalCity = sc.nextDouble();
         // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity

       double totalDistance = fromToViaDistance + viaToFinalDistance;
       double totalTime = (timeFromToVia + timeViaToFinalCity)*60;
           // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
     // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " +  fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and " + "the Total Time taken is " + totalTime + " minutes");


 }
}
