package Popup_alert_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Popup_YesOrNo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}

}
