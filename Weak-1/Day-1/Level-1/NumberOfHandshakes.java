import java.util.Scanner;
public class NumberOfHandshakes{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        // take the input from user
         int numberOfStudents=sc.nextInt();
        // calculate the number handshakes
          int numberOfHandshakes= (numberOfStudents*(numberOfStudents-1))/2 ;
          System.out.println("the number of possible handshakes. "+numberOfHandshakes);
      }

}