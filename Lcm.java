import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number a");
		int a=sc.nextInt();
		System.out.println("enter the number a");
		int b=sc.nextInt();
		int hcf=0;
		for (int i=1;true ;i++ )
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("LCM of the numbers is "+ i);
				//break;
				hcf=(a*b)/i;
				System.out.println("HCF of the numbers is "+ hcf);
				break;
			}
			
		}
		
	}
}
