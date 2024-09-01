import java.util.Scanner;
class MethodExample 
{
	public static void add(int a,int b)
	{
		System.out.println("result is "+(a+b));
	}
	public static void substraction(int a,int b)
	{
		System.out.println("result is "+(a-b));
	}
	public static void multiplication(int a,int b)
	{
		System.out.println("result is "+(a*b));
	}
	public static void division(int a,int b)
	{
		System.out.println("result is "+(a/b));
	}
	public static void modulus(int a,int b)
	{
		System.out.println("result is "+(a%b));
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("which operation to perform?????"); 
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
		int n=sc.nextInt();
		System.out.println("enter the value of a"); 
		int a=sc.nextInt();
		System.out.println("enter the value of b"); 
		int b=sc.nextInt();
		switch (n)
		{
			case 1 : add(a,b);
			break;
			case 2 : substraction(a,b);
			break;
			case 3 : multiplication(a,b);
			break;
			case 4 : division(a,b);
			break;
			case 5 : modulus(a,b);
			break;
			default :System.out.println("invalid number entered"); 
		}
	}
}
