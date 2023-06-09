package practice;

public class ForLoop {
	
	public void practiceforLoop()
	{
		int a= 1;
		for( int num=1; num<=5 ; num++)
		{
			
		a=a*num ;
		}
		System.out.println(a);
		
	}
public static void main(String args[])
{
	ForLoop o = new ForLoop();
	o.practiceforLoop();
}
}
