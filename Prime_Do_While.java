import java.util.Scanner;
class Prime_Do_While 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();  //17
		int count=0,i=1;
		
		do
		{
			if (n%i==0) //1 7
			{
				count++; //1 2
			}
			i++; //2
			
		}while (i<=n); //n==0 
		
		/*do
		{
			for (int i=1;i<=n ;i++ )
			{
				if (n%i==0) //1 7
				{
					count++; //1 2
				}
			}
			
		}while (n<0); //n==0*/
		
		if (count==2) //2=2
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a pprime number");
		}
	}
}
