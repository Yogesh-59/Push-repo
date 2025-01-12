import java.util.Scanner;
public class DiscountAmount{
 public static void main(String[]args){
     // take the value of fee 
      int fee=125000;
      // then another variable is discount
      int discountPercent=10;
      //finding the total discount in fee
      double discountAmount= (double)(fee*discountPercent)/100;
      // then total discounted fee and print
      double discountedFee= (double)(fee - discountAmount);
      System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
   }
}