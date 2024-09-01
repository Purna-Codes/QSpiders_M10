import java.util.Scanner;
class MonthSwitch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int season=sc.nextInt();
		switch(season)
		{
			/*case 1:	//System.out.println("Winter");
					//break;
			case 2:	//System.out.println("February");
					//break;
			case 3:	System.out.println("Winter");
					break;
			case 4:	//System.out.println("April");
					//break;
			case 5:	//System.out.println("May");
					//break;
			case 6:	System.out.println("Summer");
					break;
			case 7:	//System.out.println("July");
					//break;
			case 8:	//System.out.println("August");
					//break;
			case 9:	System.out.println("Rainy");
					break;
			case 10://System.out.println("October");
					//break;
			case 11://System.out.println("November");
					//break;
			case 12: System.out.println("spring");
					break;	*/
					

			case 1,2,3:	System.out.println("Winter");
						break;
			case 4,5,6:	System.out.println("Summer");
						break;
			case 7,8,9:	System.out.println("Rainy");
						break;
			case 10,11,12:	System.out.println("Spring");
							break;
			default	:System.out.println("INVALID month====>RENETER AGAIN");
		}
		System.out.println("SwitchCase executed Successfully");
	}
}
