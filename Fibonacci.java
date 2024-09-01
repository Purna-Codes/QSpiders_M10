import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("how many numbers you need to be printed ");
		int n =sc.nextInt();
		int sum=0,n1=0,n2=1;
		for(int i=0;i<=n;i++)
		{
			sum=n1+n2; //0+1 =1(sum)  //1+1 //1+2
			System.out.print(n1+" "); //0  1 1 
			n1=n2; //n1=1 1
			n2=sum;//n2=1 2
		}
	}
}

/*0
1
1
2
3
5
8
13
21
34*/
