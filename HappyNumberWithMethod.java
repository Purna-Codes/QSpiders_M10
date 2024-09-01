import java.util.Scanner;
class TechNumberWithMethod 
{
	public static int countOfDigits(int n)
	{
		int rem,x=0;
		while (n>0)
		{
			rem=n%10;
			x++;
			n=n/10;
		}
		return x; 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		int temp=n;
		int flag=0;
		int count=countOfDigits(n);
		if (count==4)
		{
			flag=num%100;
			System.out.println(flag);
		}
	}
}
