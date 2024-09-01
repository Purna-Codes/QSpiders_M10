class InfiniteLoop 
{
	public static void main(String[] args) 
	{
		/*for (;true ; )
		{
			System.out.println("Hello World!");
		}
		
		for (int i=1;true ; )
		{
			System.out.println(i);
		}
		
		//---------------WAP TO PRINT 1 TO 10 USING INFINITE LOOP-----------------
		
		for (int i=1;true ;i++ )
		{
			System.out.println(i);  //1
			if(i==10)
			{
				break;
			}
		}*/
		
		//---------------WAP TO PRINT 1st num wich is div by both 3  & 5 USING INFINITE LOOP-----------------
		
		
		for (int i=1;true ;i++ )
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i);
				break;
			}
		}
	}
}
