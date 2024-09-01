import java.util.Scanner;
class OddTable
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("the odd numbers are====>>>");
		/*for (int i=1;i<=n*2;i++ ) //output coming only if checked with num*2
		{						  //e.g-for 6, the range is the odd num between 1 to 12
				if(i%2!=0)  
				{
					System.out.print(i+" ");  
				}
		}*/
		
		for (int i=1;i<=n;i++ ) 
		{						  
			System.out.print((i*2)-1+" ");  //2-1  4-1  6-1
		}
	}
}

/*1--1
2--1 3
3--1 3 5
4--1 3 5 7 
5--1 3 5 7 9*/
