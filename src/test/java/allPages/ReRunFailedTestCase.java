package allPages;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTestCase implements IRetryAnalyzer{
	private int retryCount=0;
	private static final int maxCount=0
			;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount<maxCount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
