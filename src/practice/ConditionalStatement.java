package practice;

public class ConditionalStatement {
	int a = 90;
	
	public void ifElse()
	{
		if(a%2==0)
		{
			System.out.println(a + "IS AN EVEN NUMBER");
		}
		else
		{
			System.out.println( a + "IS AN ODD NUMBER");
		}
		
	}
	public static void main(String args[])
	{
		ConditionalStatement o = new ConditionalStatement();
		o.ifElse();
	}

}
