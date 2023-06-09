package practiceAutomation;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	public static void captureCompleteScreenshot() throws AWTException, IOException
	{
		Robot r = new Robot();
		
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(di);
		BufferedImage b = r.createScreenCapture(rect);
		File d = new File("./robotscreenshot/Robot"+System.currentTimeMillis()+".png");
		ImageIO.write(b, "png", d);
	}
	
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/Image"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, dest);
	}

	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver =HelperClass.browserSetup("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.name("username"));
		textbox.sendKeys("Admin");
		captureScreenshot(driver);
		WebElement text = driver.findElement(By.name("password"));
		text.sendKeys("admin123");
		captureScreenshot(driver);
		WebElement box = driver.findElement(By.xpath("//button[@type='submit']"));
		box.click();
		Thread.sleep(3000);
		captureScreenshot(driver);
		
		
		
		

}
}
