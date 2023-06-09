package com.pages;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class HomePage extends BaseClassTest {
	
	By click = By.xpath("//a[@href='/web/index.php/directory/viewDirectory']");
	
	public void action()
	{
		com.doClick(click);
	
	}

}
