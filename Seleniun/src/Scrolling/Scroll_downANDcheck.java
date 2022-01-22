package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_downANDcheck {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			WebElement checkbox = driver.findElement(By.xpath("//div[@id='search-results']//td//a[contains(text(),'manali28')]/parent::td/parent::tr//input"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", checkbox);
			
			checkbox.click();
	}
}