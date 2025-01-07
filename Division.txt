import java.util.*;
class Calculator{
  public static int Division(int num1, int num2){
   if (num2!=0){
     return num1/num2;
   }
     else{
       return 0;}
  }
public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   int num1=sc.nextInt();
   int num2=sc.nextInt();
      int ans=Division(num1,num2);
     System.out.println("This is Division"+ans);
 }
}