import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int n1=n;
		int sum=0,rem=0,sqr=1,count=2;
		
		for (int i=1; i<=count;i++ )
		{
			sqr=sqr*n;
		}
		System.out.println("square of the number is "+sqr);
		
		while (sqr>0)
		{
			rem=sqr%10; //5 2 2
			sum=sum+rem; //5 7 2
			sqr=sqr/10; //22 2 0
		}
		System.out.println("sum of digits is "+sum);
		
		if (n1==sum)
		{
			System.out.println("Matching!!!! It's a Neon number");
		}
		else
		{
			System.out.println("Not Matching!!!! It's not aa Neon number");
		}
	}
}