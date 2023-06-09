package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenPractice {
	WebDriver driver;
	
	@Test(priority=0,dataProvider="data")
	
	public void demo(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=1,dataProvider="datas")
	
	public void login(String uname,String pass)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	@DataProvider
	public Object[] data()
	{
		Object[]arr = {"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"};
		
		return arr;
		}
	
	@DataProvider
	public Object[][] datas()
	{
		Object[][]tarr = {{"abc","123"},{"def","456"},{"xyz","789"},{"Admin","admin123"}};
		return tarr;
	}

}
