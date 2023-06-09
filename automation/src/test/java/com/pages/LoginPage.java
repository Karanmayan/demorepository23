package com.pages;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class LoginPage extends BaseClassTest{
	
	//locators
	By uname = By.name("username");
	By pwd = By.name("password");
	By login = By.xpath("//button[@type='submit']");
	By forgot_pwd = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	
	
	
	//actions
	
	public boolean checkLink()
	{
		boolean status = driver.findElement(forgot_pwd).isDisplayed();
		return status;
	}
	
	public void login()
	{
	//	driver.findElement(uname).sendKeys("Admin");
	//	driver.findElement(pwd).sendKeys("admin123");
	//	driver.findElement(login).click();
		com.enterValue(uname, "Admin");
		com.enterValue(pwd, "admin123");
		com.doClick(login);
		
	}
	

}
