class Unary 
{
	public static void main(String[] args) 
	{
		System.out.println("EXECUTING UNARY OPERATOR");
		int a=10;
		System.out.println(a++);//11
		--a;//10
		System.out.println(a++);//10 a=11
		System.out.println("'a' value is "+a);
		int b=(a++)-(--a)+(++a)-(--a)+(a++)-(--a);
		//    11   -11   +	12	-	11	+	11	-	11= 1
		System.out.println("'b' value is "+b);
		System.out.println("======================\n");
		Unary uc=new Unary();
		uc.meth1();
	}
	void meth1()
	{
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22	 
		System.out.println(b++ + b++);//10+11=21  	
	}
	void meth2()
	{
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);// 
		System.out.println(~b);//  
		System.out.println(!c);//  
		System.out.println(!d);//  
	}}  
}
