import java.util.Scanner;
class IncrementDec
{
	public static void main(String[] args) 
	{
		IncrementDec id=new IncrementDec();
		id.meth2();
	}
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid userid");
		String uid=sc.next();
		System.out.println("Enter valid password");
		String pwd=sc.next();
		System.out.println("-----------wait until the login page is ready------------\n.\n.\n.");
	}
	void meth2()
	{
		//int sum=0;
		IncrementDec id1=new IncrementDec();
		id1.meth1();
		for(int i=1;i<=100;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
		}
	}
}
