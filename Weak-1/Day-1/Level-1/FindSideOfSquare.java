import java.util.Scanner;
public class FindSideOfSquare{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
       int perimeter= sc.nextInt();
        // Perimeter of Square is 4 times side
        int lengthOfSide= perimeter/4;
         System.out.println("The length of the side is "+lengthOfSide+" whose perimeter is:"+perimeter);
       
        }

}