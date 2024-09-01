import java.util.Scanner;
class Pallindrome_1_100
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the range in which you wanna check the pallindrome no starting from 1");
		int n=100;
		for (int i=1;i<=n ; i++)
		{
			int i1=i;//1
			int rem=0;
			int rev=0;	
			while (i1>0) //1>0
			{
				rem=i1%10; //1
				rev=rev*10+rem;//1
				i1=i1/10;	//0
			}
			if (i==rev) //1==1?-yes
			{
				System.out.println(rev);
			}
		}
	}
}
