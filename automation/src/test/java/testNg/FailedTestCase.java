package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.MyRetryAnalyzer;

public class FailedTestCase {
	
	@Test
	public void t1()
	{
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void t2()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void t3()
	{
		Assert.assertTrue(false);
	}
	

}
