class FizzBuzz 
{
	public static void main(String[] args) 
	{
		int n=7;
		if(n%3==0 && n%5==0)
		{
			System.out.println("FIZZBUZZ");
		}
		else if(n%5==0)
		{
			System.out.println("BUZZ");
		}
		else if(n%3==0)
		{
			System.out.println("FIZZ");
		}
		else
		{
			System.out.println(n);
		}
	}
}
