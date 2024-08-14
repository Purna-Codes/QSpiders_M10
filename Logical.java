class Logical 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		System.out.println((a>b)&&(b<c));     //logical and
		System.out.println(!((a>b)&&(b<c)));  //logical not(logical and)
		System.out.println((a>b)||(b<c));     //logical or
		System.out.println(!((a>b)||(b<c)));  //logical not(logical or)
	}
}
