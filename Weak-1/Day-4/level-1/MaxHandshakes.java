import java.util.*;
public class MaxHandshakes{
 // create method name is Possible Handshakes
  static int PossibleHandshakes(int number){
   // calculating the possile handshakes amoung group of people
   int maxHanshakes= (number *(number -1))/2;
  //return the max Hanshakes
   return maxHanshakes;
  }
 public static void main(String[]args){
   // taking user input as number
   Scanner sc= new Scanner(System.in);
     int number=sc.nextInt();
      // print the possible handshakes to direct call method in print statement
      System.out.printf("The maximum number of handshakes amoung %d number of Student %d%n",number,PossibleHandshakes(number));
  }
}