class LastDigit 
{
	public static void main(String[] args) 
	{
		int num=1234;
		//int lastdigit=num%10;
		System.out.println("lastdigit is= "+num%10);
		int lasttwodigits=num%100;
		System.out.println("lasttwodigits are= "+lasttwodigits);
		int lastthreedigits=num%1000;
		System.out.println("lastthreedigits are= "+lastthreedigits);
		
	}
}
