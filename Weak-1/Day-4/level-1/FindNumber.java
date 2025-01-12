import java.util.Scanner;
public class Findnumber
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();//took the input from the user
		if(positiveNegativeZero(number)==0)
		{
			System.out.println("Number is Zero");
		}	
		if(positiveNegativeZero(number)==-1)
		{
			System.out.println("Number is Negative");
		}
		if(positiveNegativeZero(number)==1)
		{
			System.out.println("Number is positive");
		}		
	}
	static int positiveNegativeZero(int number)//Fuction checks that weather the number is positive,negative or zero
	{
		
		if(number>0)
		{
			return 1;
		}
		else if(number<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}	
}