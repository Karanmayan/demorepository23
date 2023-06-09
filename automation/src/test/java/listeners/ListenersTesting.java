package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testNg.TestCasesPractice;

public class ListenersTesting extends TestCasesPractice implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("TEST STARTED");
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("TEST SUCCESSFUL");
		    
		  }
	 
	 public void onTestFailure(ITestResult result) {
		    System.out.println("TEST FAILED");
		    captureScreenshot();
		  }
	 
	 public void onStart(ITestContext context) {
		    System.out.println("EXECUTION STARTED");
		  }
	 
	 public void onFinish(ITestContext context) {
		    System.out.println("TEST FINISHED");
		  }



}
