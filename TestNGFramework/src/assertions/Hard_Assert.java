package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hard_Assert {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
		
		@Test(priority=0)
		public void verifyTitlePage() {
			String title = driver.getTitle();
			Assert.assertEquals(title, "Nikhil", "verifyingTitle");
			System.out.println("Next line after HardAssert is Running");
		}
		
		@Test(priority=1)
		public void verifyHomepageAfterLogin() {
			
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
			String Pagename = driver.findElement(By.xpath("//div[@class='head']//h1[contains(text(),'Dashboard')]")).getText();
			Assert.assertEquals(Pagename,"Dashboard","VerifyHomePage");
			System.out.println("Next line after HardAssert is Running");
		}
		@AfterSuite
		public void browserquit() {
			driver.quit();
		}
		
	}
	

