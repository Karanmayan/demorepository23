package practice;

public class LoopStatement {
	
	public void whileLoop()
	{
		int a=20;
		System.out.println("WHILE LOOP");
		while(a>=1)
		{
			System.out.println(a);
			a--;
		}
		
	}
	public void doWhileloop()
	{
		int a=20;
		System.out.println("DO WHILE LOOP");
		do
		{
			System.out.println(a);
			a--;
		}while(a>=1);
		
	}
	public void forLoop()
	{
		System.out.println("FOR LOOP");
		for(int a=20;a>=1;a--)
		{
		System.out.println(a);	
		}
		
	}
	
	public static void main (String args[])
	{
	LoopStatement o = new LoopStatement();
	o.whileLoop();
	o.doWhileloop();
	o.forLoop();
	}

}
