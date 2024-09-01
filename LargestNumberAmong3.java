class LargestNumberAmong3 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is larger");
			}
			else
			{
				System.out.println(c+" is larger");	
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is larger");
			}
			else
			{
				System.out.println(c+" is larger");
			}
		}
	}
}
