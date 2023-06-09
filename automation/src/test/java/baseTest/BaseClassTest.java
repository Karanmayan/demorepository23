package baseTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.pages.HomePage;
import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Common;

public class BaseClassTest {
	
	public static  WebDriver driver;
	Properties prop;
	
	public static Common com = new Common();
	
	public static LoginPage a = new LoginPage();
	
	public static HomePage h = new HomePage();
	
	@BeforeTest
	public void setUp() throws IOException
	{
		if(driver==null)
		{
	    File f = new File(System.getProperty("user.dir")+""
	    		+ "\\src\\test\\resources\\configFiles\\config.properties");
		FileReader fr = new FileReader(f);
		prop = new Properties();
		prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get(prop.getProperty("testUrl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 driver.get(prop.getProperty("testUrl"));
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			 driver.get(prop.getProperty("testurl"));
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			
		}
		else
		{
			System.out.println("Pass the valid browser ...");
		}
	}

	//@AfterTest
	//public void tearDown()
	//{
		///driver.close();
	//}
	
	

}
