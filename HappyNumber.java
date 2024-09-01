import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();  //97 130
		int rem=0,n1=n,sum=0;
		
		if (n1>9) //97>0 //if it's a two digit number or not
		{
			while (n1>9) //97 130 10 0-break   //stop once you get a double digit value
			{
				sum=0; //130 10------>>>>> reinitialize to rerun the loop while loop starting from 0

				while (n1>0) //97 130 10  
				{
					rem=n1%10; //79 031 01
					sum=sum+rem*rem;//130 10 1  
					n1=n1/10; //0
				}
				n1=sum;//n=130 10 1
			}
			
			if (n1==1)
			{
				System.out.println(n+" is a Happy number");
			}
			else
			{
				System.out.println(n+" is not a Happy number");
			}	
			
		}
		else
		{
			System.out.println(n1+" is not a two digit number");
		}
		
	}
}