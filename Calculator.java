class Calculator 
{
	public static void main(String[] args) 
	{
		int a=100,b=20;
		char ch='+';
		if(ch=='+')
		{
			System.out.println(a+b);
		}
		else if(ch=='-')
		{
			System.out.println(a-b);
		}
		else if(ch=='*')
		{
			System.out.println(a*b);
		}
		else if(ch=='/')
		{
			System.out.println(a/b);
		}
		else if(ch=='%')
		{
			System.out.println(a%b);
		}
		else
		{
			System.out.println("invalid operation");
		}
	}
}
