import java.util.Scanner;
class SumofEachdigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int rem=0,sum=0;
		while (n>0)
		{	
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of digit in the given number is "+sum);
		System.out.println("current value of the given number is "+n);
	}
}