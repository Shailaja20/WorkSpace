package selenium_webdriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	//when the Test Case is Failed, this method is called
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName() + "Test Case Failed");
	}
	
	//when the Test Case is skipped
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println(arg0.getName() + "Test Case Skipped");		
	}

	//When the Test Case is started, this method is called
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName() + "Test Case started");
	}

	//When the Test case is Passed
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName() + "Test case Passed");
	}

}
