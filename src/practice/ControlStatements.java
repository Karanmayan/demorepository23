package practice;

public class ControlStatements {
	int a=128;
	
	public void nestedIf()
	{
		if(a%2==0)
		{
			System.out.println(a + "  IS DIVISIBLE BY 2");
			if(a%4==0)
			{
				System.out.println(a + "  IS DIVISIBLE BY 4");
				if(a%8==0);
				{
					System.out.println(a + "  IS DIVISIBLE BY 8");
					if(a%16==0)
					{
						System.out.println(a + "  IS DIVISIBLE BY 16");
						if(a%32==0)
						{
							System.out.println(a + "  IS DIVISIBLE BY 32");
						}
					}
				}
			}
		}
	}
	public static void main(String args [])
	{
		ControlStatements o = new ControlStatements();
		o.nestedIf();
		
	}
}

