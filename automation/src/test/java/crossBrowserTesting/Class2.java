package crossBrowserTesting;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups = "smoke")
	public void m3()
	{
		System.out.println("METHOD3");
	}
	
	@Test(groups={"regression","sanity"})
	public void m4()
	{
		System.out.println("METHOD 4");
		
	}

}
