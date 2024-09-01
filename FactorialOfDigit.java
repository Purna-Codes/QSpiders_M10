import java.util.Scanner;
class  FactorialOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		int rem=0;
		while (n>0)  ///123 12
		{
			rem=n%10;  ////3 2
			int fact=1; 
			for (int i=1;i<=rem;i++)
			{
				fact=fact*i;//6

			} 
			System.out.println("factorial is "+ fact);//6
			n=n/10; //12
		}
	}
}