class SwapWithoutUsing3rdVaribale1
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("a value before swapping is "+a);
		System.out.println("b value before swapping is "+b);
		
		a=a+b;  //a-new: 10+20=30
		b=a-b;  //b-new: 30-20=10
		a=a-b;  //a-final: 30-10=20
		
		System.out.println("========post swapping=========");
		System.out.println("a value after swapping is "+a);
		System.out.println("b value after swapping is "+b);
	}	
}
