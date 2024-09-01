import java.util.Scanner;
class StrongNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range starting from 1");
		int n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			int i1=i;
			int rem=0,sum=0;
			while (i1>0) //145
			{
				int fact=1;
				rem=rem%10;  //5 4 1
				for (i1=rem;i1>=1 ;i1-- )
				{
					fact=fact*i;//120 24 1
				}
				sum=sum+fact;// 0+120+24+1
				i1=i1/10; //14 1 0
			}
			if (sum==i) //145=145
			{
				System.out.println("strong number is "+i);
				int rev=0;
				int i2=i;
				while (i2>0)
				{
					rem=i2%10; //1
					rev=rev*10+rem; //541
					i2=i2/10;//0
				}
				System.out.println("reverse of strong number is "+rev);
			}
		}
		//System.out.println("Hello World!");
	}
}
