import java.util.*;
public class FindSmallOrLargestNum{
  //create a method and there type is Array
   static int[]findSmallestAndLargest(int num1,int num2, int num3){
      int smallNumber=num1;//set the value of basis of num1 
      int largeNumber=num1;
      if (largeNumber<num2){
       largeNumber=num2;
   }
       else if (largeNumber<num3){
       largeNumber=num3;
   }
   
        
      if (smallNumber>num2){
       smallNumber=num2;
   }
        else if (smallNumber>num3){
       smallNumber=num3;
   }
     // return the array 
     //new keyword use to dynamic memory allocation in runtime
       
      return new int[]{smallNumber,largeNumber};
}
  
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
      // take input from user
     int number1=sc.nextInt();
     int number2=sc.nextInt();
      int number3=sc.nextInt();
     // call method and make new Array temp 
      int [] temp=findSmallestAndLargest(number1,number2,number3);
     System.out.println("Smallest number is :"+temp[0]+ " largest numer is :"+temp[1]);
  }
}