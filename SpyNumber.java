/*SPY NUMBER===> IF THE SUM OF THE DIGITS IS EQUAL TO THE PRODUCT OF THR DIGITS
 -----------------------------------------------------------------------------*/

import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt(); 
		int sum=0,prod=1,rem=0;
		while (n>0)
		{
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if (sum==prod)
		{
			System.out.println("number is a Spy Number!");
		}
		else
		{
			System.out.println("number is not a Spy Number!");
		}
	}
}
