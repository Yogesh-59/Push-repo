import java.util.*;
public class NaturalNumberSum{
   static int sumOfNaturalNum(int number){
      int sum=0;
      for (int i=1;i<=number;++i){
        sum +=i;
     }
     return sum;
   }
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
     int number=sc.nextInt();
     int result=sumOfNaturalNum(number);
     System.out.println("sum is N natural number "+number+" is :"+result);
  }
}