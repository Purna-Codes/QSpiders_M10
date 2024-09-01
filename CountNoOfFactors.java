class CountNoOfFactors 
{
	public static void main(String[] args) 
	{
		int n=6,count=0;
		for (int i=1;i<=n ;i++ )
		{
			if(n%i==0) //factors checking exclusing 6
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

