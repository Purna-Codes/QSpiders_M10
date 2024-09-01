import java.util.Scanner;
class TechNumberWithMethod 
{
	public static int countOfDigits(int temp)
	{
		int rem,x=0;
		while (temp>0)
		{
			rem=temp%10;
			x++;
			temp=temp/10;
		}
		return x; 
	}
	public static int divisor(int count)
	{
		int prod=1;
		for (int i=1;i<=count/2 ;i++ )
		{
			prod=prod*10;
		}
		return prod;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range starting from 1"); 
		int n=sc.nextInt();
		for (int j=1;j<=n ;j++ )
		{
		int temp=j; //2025
		int flag1,flag2,sum=0;
		int div=1;
		int count=countOfDigits(temp);
		if (count%2==0)
		{
			div=divisor(count);
			flag1=temp%div; //2025%100
			//System.out.println("2nd half is "+flag1);
			flag2=temp/div;
			//System.out.println("1st half is "+flag2);
			sum=flag1+flag2;
			if (j==sum*sum)
			{
				System.out.println(j+" is a Tech Number");
			}
			/*else
			{
				System.out.println("Not a Tech Number");
			}*/
		}
		}
	}
}
