import java.util.Scanner;
class Addition_WO_Operator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		
		/*for (int i=1; i<=b;i++ )
		{
			a++;
		}
		System.out.println("sum is "+a);*/
		
		for (int i=1; i<=b;i++ )
		{
			a--;
		}
		System.out.println("difference is "+a);
	}
}
