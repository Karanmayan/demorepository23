package practice;

public class NestedForLoop {
	
	public void nestedForLoop()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5; col++)
			{
				if( row==1 &&col==1 || row==1&&col==3 ||row==1 && col==5)
				{
					System.out.print("*");
				}
				else if ( row==2 && col==2 || row==2 && col==4)
				{
					System.out.print("*");
				}
				else if (row==3 && col==1 || row ==3 && col==3 || row==3 && col==5)
				{
					System.out.print("*");
				}
				else if ( row==4 && col==2 || row==4 && col==4)
				{
					System.out.print("*");
				}
				else if (row==5 && col==1 || row ==5 && col==3 || row==5 && col==5)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String args[])
	{
		NestedForLoop o = new NestedForLoop();
		o.nestedForLoop();
	}

}
