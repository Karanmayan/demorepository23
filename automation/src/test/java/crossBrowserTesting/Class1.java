package crossBrowserTesting;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups ="regression")
	public void m1()
	{
		System.out.println("METHOD 1");
	}
	
	@Test(groups ="smoke")
	public void m2()
	{
		System.out.println("METHOD 2");
	}

}
