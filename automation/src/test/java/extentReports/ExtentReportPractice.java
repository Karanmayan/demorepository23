package extentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportPractice {
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@BeforeTest
	public void start()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\extentreports.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	
	@Test
	public void signin()
	{
		test = extent.createTest("USER IS SIGNING ON FIRST PAGE");
		test.log(Status.PASS, "SIGNIN PAGE GOT PASS");
		
	}
	
	@Test
	public void homepage()
	{
		test= extent.createTest("HOMEPAGE TEST").assignAuthor("ABC").assignCategory("123").assignDevice("12345");
		test.pass("USER IS ON HOMEPAGE SUCCESSFULLY");
	}
	
	@Test
	public void product()
	{
		test= extent.createTest("PRODUCT PAGE").assignAuthor("123").assignCategory("123456789").assignDevice("ABC123");
		test.fail("PRODUCT PAGE FAIL");
	}
	
	@AfterTest
	public void quit()
	{
		extent.flush();
	}
	
	
	
}
