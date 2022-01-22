package asdf;

import static org.testng.Assert.assertEquals;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class prac {
	
	@Test(priority = 0,groups = "sanity")
	public static void java() {	
		Reporter.log("Checking Reporter2");
		assertEquals(false, true);
	}
	@Test(priority = 1,groups = "sanity",dependsOnMethods = "java",enabled = true)
	public static void java2() {
		Reporter.log("Checking Reporter",true);
	}
}
