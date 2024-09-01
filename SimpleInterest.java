import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		int p=sc.nextInt();
		System.out.println("enter time in years");
		int t=sc.nextInt(); 
		int r=5; 
		int i=(p*t*r)/100;
		System.out.println("simple interest is "+i);
	}
}
