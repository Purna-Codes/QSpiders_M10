import java.util.Scanner;
class  PerfectSquareDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();  //36
		int count=0,i=1;
		boolean flag=false;
		
		/*do
		{
			if (i*i==n) //6*6
			{
				count++; //1
			}
			i++;//1-----5f==6==7------36f
				
		}while (i<=n); */
		
		do
		{
			if (i*i==n) //6*6
			{
				flag=true; 
			}
			i++;
				
		}while (i<=n); //
		
		if (flag)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}
	}
}