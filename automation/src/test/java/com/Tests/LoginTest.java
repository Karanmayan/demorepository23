package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class LoginTest extends BaseClassTest{
	
	@Test(priority=0)
	public void checkForgetPwd_linkExist()
	{
		boolean status = a.checkLink();
		Assert.assertTrue(status);
	}
	
	@Test(priority=1)
	public void doLogin()
	{
		a.login();
	}
	
	@Test(priority=2)
	public void doSearch()
	{
		h.action();
	}

}
