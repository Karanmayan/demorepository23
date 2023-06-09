package practiceAutomation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWindows {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchbox.sendKeys("selenium");
		searchbox.sendKeys(Keys.ENTER);
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		
		for(WebElement link:alllinks)
		{
			link.click();
		}
		String parentwindowid = driver.getWindowHandle();
		System.out.println("parent window id is"+parentwindowid);
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String currhandle:allhandles)
		{
			driver.switchTo().window(currhandle);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
	}

}
