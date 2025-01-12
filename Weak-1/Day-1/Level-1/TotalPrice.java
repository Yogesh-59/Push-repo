import java.util.Scanner;
public class TotalPrice{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        // take the input from user
         int unitPrice=sc.nextInt();
         int quantity=sc.nextInt();
        // calculate the total price
          int totalPrice= unitPrice*quantity;
          System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
      }

}