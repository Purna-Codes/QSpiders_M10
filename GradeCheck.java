class GradeCheck 
{
	public static void main(String[] args) 
	{
		char grade1='x';
		if(grade1=='A')
		{
			System.out.println("DISTINCTION");
		}
		else if(grade1=='B')
		{
			System.out.println("FIRST CLASS");
		}
		else if(grade1=='C')
		{
			System.out.println("SECOND CLASS");
		}
		else if(grade1=='D')
		{
			System.out.println("PASS");
		}
		else if(grade1=='E')
		{
			System.out.println("FAIL");
		}
		else
		{
			System.out.println("invalid grade");
		}
	}
}
