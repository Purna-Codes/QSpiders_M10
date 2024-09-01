class GradeSwitch 
{
	public static void main(String[] args) 
	{
		char grade='A';
		switch(grade)
		{
			case 'A':	System.out.println("DISTINCTION");
						break;
			case 'B':	System.out.println("FIRST CLASS");
						break;
			case 'C':	System.out.println("SECOND CLASS");
						break;
			case 'D':	System.out.println("PASS");
						break;
			case 'E':	System.out.println("FAIL");
						break;
			default	:	System.out.println("INVALID GRADE====>RENETER AGAIN");
		}
		System.out.println("SwitchCase executes Successfully");
	}
}
