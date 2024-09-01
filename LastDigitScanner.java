import java.util.Scanner;
class LastDigitScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int lastdigit=n%10;
		System.out.println("last digit of the "+n+" is "+lastdigit);
	}
}
