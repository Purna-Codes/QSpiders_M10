import java.util.Scanner;
class  ReverseNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();  //123
		int sum=0,rev=0;
		while (n>0)
		{
			int rem=n%10;		//3	2	1
			rev=rev*10+rem;	//0*10+3=3	3*10+2=32	32*10+1=321
			n=n/10;				//12 1	0
		}
		System.out.println(rev);
	}
}
