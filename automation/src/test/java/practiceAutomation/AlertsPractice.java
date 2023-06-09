package practiceAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPractice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =HelperClass.browserSetup("chrome");
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("123");
		alt2.accept();
		driver.findElement(By.xpath("//button[text()='Modern Alert']")).click();
		
		
		
		
	}
	

}
