package practice;

public class PracticeForLoop {
	
	public void forLoop()
	{
		int a =5;
		for(int num=1; num<=10;num++)
		{
			System.out.print(a);
			System.out.print("*");
			System.out.print(num);
			System.out.print("=");
			System.out.print(a*num);
			System.out.println( );
			
			
		}
		
		
	}
	public static void main(String args[])
	{
		PracticeForLoop o = new PracticeForLoop();
		o.forLoop();
	}

}
