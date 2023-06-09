package practice;

public class PracticeNestedIf {
	int mark= 75;
	
	public void ifElseIf()
	{
		if(mark<=100 && mark>=90)
		{
			System.out.println(mark + " A GRADE");
		}
		else if(mark<=90 && mark>=80)
		{
			System.out.println( mark + "B GRADE" );
		}
		else if(mark<=80 && mark>=70)
		{
			System.out.println( mark +" C GRADE" );
		}
		else if (mark<=50 && mark>=60)
		{
			System.out.println( mark + " D GRADE");
		}
		else if (mark>=50)
		{
			System.out.println( mark + "E GRADE");
		}
		else
		{
			System.out.println( mark + " FAIL");
		}
		
	}
	public static void main (String args[])
	{
		PracticeNestedIf o = new PracticeNestedIf();
		o.ifElseIf();
	}

}
