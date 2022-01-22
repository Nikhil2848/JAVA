package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_everyCheckBox {
	
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		List<WebElement> check = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		for(WebElement ck:check)
			System.out.println(ck.getText());
//			ck.click();
		}

}
