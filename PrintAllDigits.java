import java.util.Scanner;
class PrintAllDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		int a=0;
		while (n>0)
		{
			a=n%10;
			System.out.println(a);
			n=n/10;
		}
	}
}
