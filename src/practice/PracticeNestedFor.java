package practice;

public class PracticeNestedFor {
	
	public void nestedFor()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if((row%2==1 && col%2==0) || (row%2==0 && col%2==1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}

	public static void main(String args[]) 
	{
		PracticeNestedFor o = new PracticeNestedFor();
		o.nestedFor();
		
	}
}
