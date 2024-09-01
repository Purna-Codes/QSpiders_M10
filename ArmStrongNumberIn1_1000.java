import java.util.Scanner;
class  ArmStrongNumberIn1_1000
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range starting from 1"); 
		int n=sc.nextInt();
		
		for (int j=1;j<=n ;j++ ) //
		{
			//System.out.println("j value at the starting of the loop is "+j);
			int rem=0,sum=0,count=0,prod=1;
			int temp=j; //1
	
			while (j>0)  //1>0
			{
				rem=j%10;  //1
				count++;   //1
				j=j/10;    // 0
			}
			//System.out.println("No of digits i.e count is "+count);
		
			j=temp; //j=1
			while (j>0) // 1>0 
			{
				rem=j%10; // 1
				prod=1;
				
				for (int i=1; i<=count;i++ ) // 1<=1
				{
					prod=prod*rem; // 1
				}
	
				sum=sum+prod; // 0+1=1
				j=j/10;  // 0
			}
			//System.out.println("sum of the digits^count "+sum);
		
			if (temp==sum) //1==1
			{
				System.out.println(temp);//1
			}
			j=temp;
	  }
	}
}