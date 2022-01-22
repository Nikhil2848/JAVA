package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	public static WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeSuite
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void verifyPageTitle() {
		String title = driver.getTitle();
		this.softAssert = new SoftAssert();
		softAssert.assertEquals(title,"Nikhil","Assertion Failed Title Is OrangeHRM");
		System.out.println("Title Assertion Failed");
		String URL = driver.getCurrentUrl();
		softAssert.assertEquals(URL, "asdfghjkl","Assertion Failed not URL");
		System.out.println("URL Assertion Failed");
		softAssert.assertAll();
	}
	@Test(priority=1)
	public void LoginAndHomePage() {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String title = driver.findElement(By.xpath("//div[@class='head']//h1[contains(text(),'Dashboard')]")).getText();
		this.softAssert = new SoftAssert();
		softAssert.assertEquals(title,"Dashboard","softAssert Running");
		System.out.println("SoftAssert is Passed");
		softAssert.assertAll();
	}
	@AfterSuite
	public void quit() {
		driver.quit();
	}
}
