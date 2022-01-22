package Popup_alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_button {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
