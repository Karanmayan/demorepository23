package practice;

public class PracticeIfElse {
	int a = 50;
	
	public void ifElse()
	{
		if(a>=1)
		{
			System.out.println(a + "IS A POSITIVE NUMBER");
		}
		else 
		{
			System.out.println( a + "IS A NEGATIVE NUMBER");
		}
	}
	public static void main(String args[])
	{
		PracticeIfElse o = new PracticeIfElse();
		o.ifElse();
	}

}
