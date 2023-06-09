package practiceAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		int size = checkbox.size();
		System.out.println(size);
		System.out.println("USING FOR LOOP");
		for(int i=0;i<checkbox.size();i++)
		{
			
			
				checkbox.get(i).click();
			
			
		}
			
	}

}
