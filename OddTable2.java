import java.util.Scanner;
class OddTable2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%2==0) //4
		{
			n=n-1;  //3
		}
		
		System.out.println("the odd numbers are====>>>");
		
		for (int i=1;i<=n*2 ; i++) //n=6
		{
			if (i%2!=0)
			{
				System.out.println(i+"\t");
			}
		}
	}
}

/*1--1
  2--1 
  3--1 3 5
  4--1 3 5  
  5--1 3 5 7 9
  6--1 3 5 7 9 */