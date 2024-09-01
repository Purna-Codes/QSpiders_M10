import java.util.Scanner;
class Pallindrome_Do_While 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();  //121
		int temp=n,rem=0,rev=0;
		do
		{
			rem=n%10; //1 2 1
			rev=rev*10+rem; //121
			n=n/10; //12 1 0
			
		}while (n>0);
		
		if (temp==rev) //121=121
		{
			System.out.println(temp+" is a pallindrome number");
		}
		else
		{
			System.out.println(temp	+" is not a pallindrome number");
		}
	}
}
