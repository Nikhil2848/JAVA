package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_IsEnabled_IsDisplayed {
	
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
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		
		boolean output = driver.findElement(By.id("ohrmList_chkSelectAll")).isEnabled();
		System.out.println(output);
		
		boolean output1 = driver.findElement(By.id("btnAdd")).isDisplayed();
		System.out.println(output1);
	}

}
