import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		int n1=n;
		int rem=0,sum=0;
		while (n>0)  ///123 12
		{
			rem=n%10;  ////3 2
			int fact=1; 
			for (int i=1;i<=rem;i++)
			{
				fact=fact*i;//6

			} 
			sum=sum+fact;//0+6	
			n=n/10; //12
		}
		System.out.println("sum of factorial is "+ sum);//6
		if (n1==sum)
		{
			System.out.println("Yes! Its matching, hence A Strong Number");//6
		}
		else
		{
			System.out.println("No! It's not matching, hence not a Strong Number");
		}
	}
}