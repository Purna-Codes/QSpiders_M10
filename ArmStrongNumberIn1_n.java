/*1.for loop for 1 to n
  2.checking the no of digits
  3.reassigning the value of n to original value
  4.Calculating the power of the indivisual number*/
  
  //int flag=temp; //1 -- check finally with flag
  	//perform swapping operation like b=a & c=b//

import java.util.Scanner;
class  ArmStrongNumberIn1_n
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range starting from 1"); 
		int n=sc.nextInt();
		System.out.println("Armstrong numbers from 1 to "+n+" are----->"); 
		for (int j=1;j<=n ;j++) //don't use j anywhere
		{
			int rem=0,sum=0,count=0,prod=1;
			
			int temp=j; //1 --- perform operation with temp
			while (temp>0)  //1>0
			{
				rem=temp%10;  //1
				count++;   //1
				temp=temp/10;  // 0
			}
			//System.out.println("No of digits i.e count is "+count);

			temp=j;//flag=1---->1 //reassign the vale 
			
			while (temp>0) // 1>0 
			{
				rem=temp%10; // 1
				prod=1;
				
				for (int i=1; i<=count;i++ ) // 1<=1
				{
					prod=prod*rem; // 1
				}
	
				sum=sum+prod; // 0+1=1
				temp=temp/10;  // 0
			}
			//System.out.println("sum of the digits^count "+sum);
			
			if (j==sum) //1==1
			{
				System.out.println(j);//1
			}
		}
	}
}