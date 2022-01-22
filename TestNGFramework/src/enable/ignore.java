package enable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ignore {
	
	@Test(enabled=true)
	public void test1() {
		Reporter.log("check1",true);
	}
	
	@Test(enabled=false)
	public void test2() {
		Reporter.log("check2",true);
	}
	
	@Test(enabled=true)
	public void test3() {
		Reporter.log("check3",true);
	}

}
