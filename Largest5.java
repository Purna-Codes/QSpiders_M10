class Largest5
{
	public static void main(String[] args) 
	{
		int a=10,b=290,c=30,d=2,e=1000;
		if(a>b && a>c && a>d && a>e)
		{
			System.out.println(a+" is largest");
		}
		else if(b>c && b>d && b>e)
		{
			System.out.println(b+" is largest");
		}
		else if(c>d && c>e) // c >a iss checked in if bloack and c>b is checked in 1st else-if block
		{
			System.out.println(c+" is largest");
		}
		else if(d>e) // d >a iss checked in if block, d>b is checked in 1st else-if block,d>c is checked in 2nd else-if block
		{
			System.out.println(d+" is largest");
		}
		else
		{
			System.out.println(e+" is largest");
		}
	}	
}