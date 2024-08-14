class Datatypes 
{
	public static void main(String[] args) 
	{
		byte b=12;
		short s=500;
		int i=5121;
		long l=91281L;
		
		/*Error if given out of range===> compiler is asking to type cast it/covert into the compatibel datatype.
		
		*****Datatypes.java:5: error: incompatible types: possible lossy conversion from+ int to byte
                byte b=129;**********
		*/
		
		float f=1.31f;
		double d=1.512361;
		
		char ch='a';
		boolean bool=false;
		
		System.out.println("\n=====PRINTING VALUES=====\n");
		
		System.out.println("byte b value is "+b);
		System.out.println("short s value is "+s);
		System.out.println("int i value is "+i);
		System.out.println("long l value is "+l);
		System.out.println("float f value is "+f);
		System.out.println("double d value is "+d);
		System.out.println("char ch value is "+ch);
		System.out.println("boolean bool value is "+bool);
		
		System.out.println("\nAll datatypes are printed successfully");
	}
}
