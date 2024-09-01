import java.util.Scanner;
class Square_Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=n; //97
		int rem=0,sum=0;
		if (n>9)
		{
			while (n1>0)
			{
				rem=n1%10; //7 9
				sum=sum+rem*rem;//49+81
				n1=n1/10;//9 0

			}

			System.out.println("sum of square of the digits are "+sum);
		}
		else
		{
			System.out.println("Oops!! It's not a two digit number");
		}
		
	}
}
