package annotations_sequence;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void Test() {
		Reporter.log("Nikhil Badalu",true);
	}
	@BeforeSuite
	public void BeforeSuite() {
		Reporter.log("Suite",true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("Suite",true);
	}
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("Test",true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("Test",true);
	}
	@BeforeClass
	public void BeforeClass() {
		Reporter.log("Class",true);		
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("Class",true);
	}
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("Method",true);
	}
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("Method",true);
	}
}
