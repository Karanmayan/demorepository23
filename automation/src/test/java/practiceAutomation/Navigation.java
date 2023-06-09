package practiceAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
