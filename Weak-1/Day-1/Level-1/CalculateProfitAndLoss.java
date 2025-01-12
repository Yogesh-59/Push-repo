import java.util.Scanner;
public class CalculateProfitAndLoss{
 public static void main(String[]args){
   // take cost price in given 
    double costPrice=129;
    //taking selling price
    double sellingPrice=191;
    //finding the total profit and loss
    double profit=(sellingPrice - costPrice);
    //calculate the total profit percentage
    double profitPercentage= ((profit /costPrice)*100);
    //first we can print the cost price and selling price
    System.out.println("The Cost Price in INR "+ costPrice +" and Selling Price is INR "+sellingPrice);
    // than print the profit and there percentage
    System.out.println("The Profit is INR "+ profit +" and the Profit Percentage is "+profitPercentage);
   }
}