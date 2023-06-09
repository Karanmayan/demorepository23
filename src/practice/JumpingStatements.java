package practice;

public class JumpingStatements {
	
	public void continueStatement()
	{
		for(int a=1;a<=10;a++)
		{
			if(a==5)
			{
				continue;
			}
			System.out.println(a);
		}
		
	}
public void breakStatement()
{
	for(int a=1;a<=10;a++)
	{
		if(a==5)
		{
			break;
		}
		System.out.println(a);
	}
	
}
public static void main(String args[])
{
	JumpingStatements o = new JumpingStatements();
	o.continueStatement();
	o.breakStatement();
}
}
