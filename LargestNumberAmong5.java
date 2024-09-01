class LargestNumberAmong5
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30,d=100,e=15 ;
		if(a>b) 
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						System.out.println(a+" is larger");                       
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println(d+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
			}
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						System.out.println(c+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println(d+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						System.out.println(b+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println(d+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
			}
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						System.out.println(c+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println(d+" is larger");
					}
					else
					{
						System.out.println(e+" is larger");
					}
				}
			}
		}
	}
}
				