import java.util.Scanner;
class Armstrong_With_Methods 
{
	public static int countDigit(int n)
	{
		int rem,count=0;
		while (n>0)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	public static int powerOf(int rem, int digit)
	{
		int prod1=1;
		for (int i=1;i<=digit ;i++ )
		{
			prod1=prod1*rem;
		}
		return prod1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		int temp=n;
		int rem,prod=0;
		int sum=0;
		int digit=countDigit(n);
		n=temp;
		while (n>0)
		{
			rem=n%10;
			prod=powerOf(rem,digit); //3,3
			sum=sum+prod;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
}
	