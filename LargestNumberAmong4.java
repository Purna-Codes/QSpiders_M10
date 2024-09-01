class LargestNumberAmong4
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=300,d=100;
		if(a>b) 
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a+" is larger");
				}
				else
				{
					System.out.println(d+" is larger");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+" is larger");
				}
				else
				{
					System.out.println(d+" is larger");
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(b+" is larger");
				}
				else
				{
					System.out.println(d+" is larger");
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c+" is larger");
				}
				else
				{
					System.out.println(d+" is larger");
				}
			}
		}
	}
}				