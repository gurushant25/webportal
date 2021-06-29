package common;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {
	
	public void onFinish(ITestContext context) {
		System.out.println("Finished");
	}
	
	public void onStart(ITestContext context) {
		System.out.println("Started");
	}
	
	

}
