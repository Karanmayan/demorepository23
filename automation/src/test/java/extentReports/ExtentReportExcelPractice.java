package extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportExcelPractice {
	
	WebDriver driver;
	@BeforeMethod
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}
	
	@Test(dataProviderClass = ExcelReader.class , dataProvider= "getData")
	public void check(String fname, String lname, String add)
	{
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(add);
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("123456");
		driver.findElement(By.id("secondpassword")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		driver.close();
	}

}
