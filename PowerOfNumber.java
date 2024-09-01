import java.util.Scanner;
class PowerOfNumber
{
	publi c static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();  //2
		System.out.println("enter a");
		int a=sc.nextInt();  //5
		
		//===================USING DO-WHILE LOOP===============//
		
		/*int c=1;
		do
		{
			c=c*n; // 1*2   
			a--; // 4
		}
		while (a>0);
		System.out.println("2^5 = "+c);*/
		
		//===================USING FOR LOOP===============//
		
		/*int c=1;
		for (int i=1;i<=a ;i++ )
		{
			c=c*n; // 1*2
		}
		System.out.println("2^5 = "+c);*/
		
		//===================USING WHILE LOOP===============//
		
		int c=1;
		while (a>0)
		{
			c=c*n;
			a--;//2*1
		}
		System.out.println("2^5 = "+c);
	}

}
