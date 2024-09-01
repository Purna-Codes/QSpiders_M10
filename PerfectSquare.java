import java.util.Scanner;
class PerfectSquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sqr=0,count=0;
		boolean flag=false;

		/*while (n>0)
		{
			for (int i=1;i<=n ;i++ )
			{
				if (n/i==i)
				{
					sqr=i*i;
				}
			}
			if (sqr==n)
			{
				System.out.println("perfect square");
				break;
				
			}
			else 
			{
				System.out.println("not perfect square");
				break;
				
			}	
		}*/
		
		/*for (int i=1;i<=36 ;i++ )
		{
			if (i*i==n)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if (flag)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}*/
			
		for (int i=1;i<=36 ;i++ )
		{
			if (i*i==n)
			{
				count++;
			}
		}
		if (count==1)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}
	}
}