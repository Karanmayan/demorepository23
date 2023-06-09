package practiceAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement inputbox = driver.findElement(By.id("datepicker"));
        inputbox.click();
        
        String month = "June";
        String date = "30";
        String year = "1998";
        
        while(true)
        {
        	String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	
        	if(mon.equals(month)&& yr.equals(year))
        	{
        		break;
        	}
        	else
        	{
        		driver.findElement(By.xpath("//span[text()='Prev']")).click();
        	}
        }
        
       List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a")); 
       
       for(WebElement dat: alldates)
       {
    	   String datee = dat.getText();
    	   
    	   if(datee.equals(date))
    	   {
    		   dat.click();
    	   }
       }
}
}
