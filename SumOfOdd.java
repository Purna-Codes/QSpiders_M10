class SumOfOdd 
{
	public static void main(String[] args) 
	{
		int sum=0,i=1;
		for(;i<=100;)
		{
			i++;
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
