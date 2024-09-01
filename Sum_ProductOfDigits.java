import java.util.Scanner;
class Sum_ProductOfDigits 
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
		System.out.println("sum of digits of the number is "+sum);
		System.out.println("product of digits of the number is "+prod);
	}
}
