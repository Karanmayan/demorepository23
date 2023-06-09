package practice;

public class PracticeIfElseIf {
	String a="MARCH";
	public void ifElseIf()
	{
		if(a=="JANUARY")
		{
			System.out.println("THE MONTH IS JANUARY");
		}
		else if(a=="FEBURARY")
		{
			System.out.println("THE MONTH IS FEBURARY");
		}
		else if (a=="MARCH")
		{
			System.out.println("THE MONTH IS MARCH");
		}
			
	}
	public static void main(String args[])
	{
		PracticeIfElseIf o = new PracticeIfElseIf();
		o.ifElseIf();
	}

}
