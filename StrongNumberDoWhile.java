import java.util.Scanner;
class  StrongNumberDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();  //145
		int n1=n;
		int rem=0,fact,sum=0;
		boolean flag=false;
		do
		{
			fact=1;
			rem=n%10;  //5 4 1
	
			for (int i=1; i<=rem; i++)
			{
				fact=fact*i; //120 24 1
			} 
			sum=sum+fact;//120+24+1
			n=n/10; //14 1 0
			
/*=====================================================			
			/*do
			{
				fact=fact*rem; //5
				sum=sum+fact;
				i++;
			}
			while (i<=rem);
			
			sum=sum+fact;//120+24+1
			n=n/10; //14 1 0
=======================================================	*/		
				
		}while (n>0); 
		
		if (n1==sum)//145=145
		{
			System.out.println("Yes! Its matching, hence A Strong Number");//6
		}
		else
		{
			System.out.println("No! It's not matching, hence not a Strong Number");
		}
	}
}