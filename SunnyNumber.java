import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sun=0,count=0;
		boolean flag=false;

		while (n>0)
		{
			for (int i=1;i<=n ;i++ )
			{
				if ((n+1)/i==i) //36/6=
				{
					sun=i*i-1;/
				}
			}
			if (sun==n)
			{
				System.out.println("sunny number");
				break;
				
			}
			else 
			{
				System.out.println("not sunny number");
				break;
				
			}	
		}
		
		/*for (int i=1;i<=35 ;i++ )
		{
			if (i*i==n+1)
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
			
		/*for (int i=1;i<=n ;i++ )
		{
			if (i*i==n+1)
			{
				count++;
			}
		}
		if (count==1)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println("not a sunny number");
		}*/
	}
}