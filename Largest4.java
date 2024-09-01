class Largest4
{
	public static void main(String[] args) 
	{
		int a=10,b=290,c=30,d=2;
		if(a>b && a>c && a>d)
		{
			System.out.println(a+" is largest");
		}
		else if(b>c && b>d)
		{
			System.out.println(b+" is largest");
		}
		else if(c>d) // c >a iss checked in if bloack and c>b is checked in 1st else-if block
		{
			System.out.println(c+" is largest");
		}
		else
		{
			System.out.println(d+" is largest");
		}
	}	
}