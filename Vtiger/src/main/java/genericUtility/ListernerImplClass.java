package genericUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImplClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		
		String MethodName = result.getMethod().getMethodName();
		try {
			String FaiedScript = WebDriverUtility.getScreenShot(Baseclass.sdriver, MethodName);
			
			} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	

}
