package invocationCount;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTimes {
	
	@Test(invocationCount=10)
	public void Test1() {
		Reporter.log("Test",true);
	}

}
