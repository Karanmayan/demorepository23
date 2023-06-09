package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextPractice {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String text1 = driver.findElement(By.xpath("//a[text()='हिन्दी']")).getText();
		System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("//a[text()='বাংলা']")).getText();
		System.out.println(text2);
		
		String text3 = driver.findElement(By.xpath("//a[text()='తెలుగు']")).getText();
		System.out.println(text3);
		
		String text4 = driver.findElement(By.xpath("//a[text()='मराठी']")).getText();
		System.out.println(text4);
		
		String text5 = driver.findElement(By.xpath("//a[text()='தமிழ்']")).getText();
		System.out.println(text5);
		
		driver.close();
		

}
}
