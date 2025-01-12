import java.util.Scanner;
public class IntOperation{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
 // take the user input a, b, c
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
// performing given operation
  int operation1= a+b*c;
  int operation2= a*b+c;
  int operation3= c+a/b;
  int operation4= a%b+c;
  System.out.println("The results of int operation are "+operation1+","+operation2+","+operation3+",and"+operation4);
 }
}
  