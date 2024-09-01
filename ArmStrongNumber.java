/*1.checking the no of digits
  2.reassigning the value of n to original value
  3.Calculating the power of the indivisual number*/

import java.util.Scanner;
class  ArmStrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		int n1=n; //153
		int rem=0,sum=0,count=0,prod=1;
	
		while (n>0)  ///153 15
		{
			rem=n%10;  //5 3 1
			count++;   //1 2 3
			n=n/10;    //15 1 0
		}
		System.out.println("No of digits i.e count is "+count);
		int x=count;
		n=n1; //153
		while (n>0) //153 
		{
			rem=n%10; //3 5 1
			prod=1;

			/*for (int i=1; i<=count;i++ )
			{
				prod=prod*rem; //27 125 1
			}*/
			
			/*count=x;
			do
			{
				System.out.println("sum of the digits^count "+rem);
				prod=prod*rem; //1*5*5*5
				count--; //0
			}
			while (count>0); //3 */
			
			count=x;
			while (count>0)
			{
				prod=prod*rem;
				count--;
			}
			
			sum=sum+prod; //27+125+1=153
			n=n/10;  //15 1 0 
		}
		System.out.println("sum of the digits^count "+sum);
		
		if (n1==sum)
		{
			System.out.println("=======================\nYes! Its matching, hence an Armstrong Number");//153=153
		}
		else
		{
			System.out.println("=======================\nNo! It's not matching, hence not an Armstrong Number");
		}
	}
}