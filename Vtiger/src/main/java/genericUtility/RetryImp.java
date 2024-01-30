package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImp implements IRetryAnalyzer{

	
	int count= 0;
	int upperLimit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<upperLimit) {
		return true;
	                }
	return false;
	}
}
