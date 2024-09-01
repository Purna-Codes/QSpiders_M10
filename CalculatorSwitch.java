class CalculatorSwitch 
{
	public static void main(String[] args) 
	{
		int a=100,b=20;
		char operator='+';
		switch(operator)
		{
			case '+':	System.out.println(a+b);
						break;
			case '-':	System.out.println(a-b);
						break;
			case '*':	System.out.println(a*b);
						break;
			case '/':	System.out.println(a/b);
						break;
			case '%':	System.out.println(a%b);
						break;
			default	:	System.out.println("INVALID opearator====>RENETER AGAIN");
		}
		System.out.println("SwitchCase executed Successfully");
	}
}
