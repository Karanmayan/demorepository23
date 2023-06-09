package crossBrowserTesting;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups={"regression","smoke"})
	public void m5()
	{
		System.out.println("METHOD5");
	}
	
	@Test(groups={"smoke","sanity"})
	public void m6()
	{
		System.out.println("METHOD 6");
		
	}

}
