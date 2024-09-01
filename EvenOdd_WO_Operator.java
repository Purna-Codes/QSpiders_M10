import java.util.Scanner;
class EvenOdd_WO_Operator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		int a =sc.nextInt(),sum=0;
		
		/*for (int i=0;i<=a ; i+=2)  //0+2=2+2=4+2=6+2=8
		{
			sum=i; // 0 2 4 6
		}
		if(sum==a) //2=2,4=4 
		{
			System.out.println(a+" is even!");
		}
		else
		{
			System.out.println(a+" is odd!");
		}*/
		
		/*for (int i=a;i>=0 ; i-=2) //6-2=4-2=2-2=0
		{
			sum=i; //6 4 2 0
		}
		if(sum==0)
		{
			System.out.println(a+" is even!");
		}
		else
		{
			System.out.println(a+" is odd!");
		}*/
		
		if ((a/2)*2==a)
		{
			System.out.println(a+" is even!");
		}
		else
		{
			System.out.println(a+" is odd!");
		}	
	}
}
