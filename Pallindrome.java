import java.util.Scanner;
class  Pallindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt(); 
		int n1=n;//123
		int rev=0;
		while (n1>0)
		{
			int rem=n1%10;	
			rev=rev*10+rem;	//0*10+3=3	3*10+2=32	32*10+1=321
			n1=n1/10;				//12 1	0
		}
		if (rev==n)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}
}