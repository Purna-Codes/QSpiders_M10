class FactorialofN
{
	public static void main(String[] args) 
	{
		int n=6,fact=1;				
		for (int i=n; i>=1; i--)	//by using decrement operator inside for loop
		{
			fact=fact*i;
		}
		System.out.print(fact);
	}
}