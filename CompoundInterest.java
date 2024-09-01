import java.util.Scanner;
class CompoundInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p=sc.nextDouble();
		
		System.out.println("enter time in years");
		double t=sc.nextDouble(); 
		double r=5.4;double prod=1;double sum=0;
		double x=1+(r/100);
		System.out.println(x);
		for (double i=1;i<=t ;i++ )
		{
			prod=prod*x;
		}
		sum=p*prod;
		System.out.println("compound interest is "+sum);
	}
}

//p(1+r/100)t 1.5