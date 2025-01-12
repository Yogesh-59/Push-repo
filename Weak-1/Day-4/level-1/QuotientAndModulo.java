import java.util.*;
public class QuotientAndModulo{
  // create method for calculate Quotient
   static int quotient(int num,int divisor){
      if (num >=divisor){
         return num/divisor;
       }
      return 0;
}
 //create method for calculate modulo
 static int modulo(int num,int divisor){
      if (num >=divisor){
         return num%divisor;
       }
      return 0;
}
   public static int[] findRemainderAndQuotient(int number, int divisor){
     
     int ans1=quotient(number,divisor);
     int ans2=modulo(number,divisor);
     return new int[]{ans1, ans2};
   }
  
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
      // take input from user
     int number=sc.nextInt();
     int divisor=sc.nextInt();
     int []temp=findRemainderAndQuotient(number, divisor);
     System.out.println("quotient of number is :"+temp[0]+" and modulo is :"+temp[1]);
  }
}