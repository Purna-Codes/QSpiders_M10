import java.util.Scanner;
class ArithmeticOpeartionUsingScannerInEachMethod
{
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		System.out.println("result is "+(a+b));
	}
	public static void substraction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		System.out.println("result is "+(a-b));
	}
	public static void multiplication() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		System.out.println("result is "+(a*b));
	}
	public static void division()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		System.out.println("result is "+(a/b));
	}
	public static void modulus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		System.out.println("result is "+(a%b));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("which operation to perform?????"); 
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
		int n=sc.nextInt();
		switch (n)
		{
			case 1 : add();
			break;
			case 2 : substraction();
			break;
			case 3 : multiplication();
			break;
			case 4 : division();
			break;
			case 5 : modulus();
			break;
			default :System.out.println("invalid number entered"); 
		}
	}
}
