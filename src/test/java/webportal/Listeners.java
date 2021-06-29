package webportal;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Utilities;

public class Listeners extends Utilities implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("Started");
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			Utilities.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
