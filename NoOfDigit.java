import java.util.Scanner;
class NoOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		while (n>0)
		{
			int rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("no of digit in the given number is "+count);
	}
}
