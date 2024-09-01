import java.util.Scanner;
class ScannerClassMethods  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter byte value");
		byte b=sc.nextByte();
		
		System.out.println("Enter short value");
		short s=sc.nextShort();

		System.out.println("Enter int value");
		int i=sc.nextInt();

		System.out.println("Enter long value");
		long l=sc.nextLong();

		System.out.println("Enter float value");
		float f=sc.nextFloat();
		
		System.out.println("Enter double value");
		double d=sc.nextDouble();
		
		System.out.println("Enter char value");
		char ch=sc.next().charAt(0);
		
		System.out.println("Enter boolean value");
		boolean bool=sc.nextBoolean();
		 
		System.out.println("Enter string1 value");
		String s1=sc.next();
		
		System.out.println("Enter string2 value");
		String s2=sc.nextLine();
		
		System.out.println("====================================");
		
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("int value is "+i);
		System.out.println("long value is "+l);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);
		System.out.println("char value is "+ch);
		System.out.println("boolean value is "+bool);
		System.out.println("String1 value is "+s1);
		System.out.println("String2 value is "+s2);
	}
}