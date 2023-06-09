package testNg;

import org.testng.annotations.Test;

public class Attributes {
	
	@Test(priority=1,description="START THE PROGRAM")
	public void start()
	{
		System.out.println("START THE PROGRAM");
	}
	
	@Test(priority=2,description="RUN THE PROGRAM",dependsOnMethods="output",alwaysRun=true)
	public void run()
	{
		System.out.println("RUN THE PROGRAM");
		
	}
	
	@Test(priority=3,description="OUTPUT OF THE PROGRAM",invocationCount=3,enabled=true)
	public void output()
	{
		System.out.println("OUTPUT OF THE PROGRAM");
	}

}
