package Test_Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import Main_Java.Base_Class;
import Main_Java.Login_Page;
import Main_Java.hovering;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test extends Base_Class {

	@BeforeSuite
	public void WebBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void pageObject() {
		login = new Login_Page(driver);
		
	}
	@BeforeClass
	public void pageObject1() {
		hov = new hovering(driver);
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
