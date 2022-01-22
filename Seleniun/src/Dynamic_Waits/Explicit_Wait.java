package Dynamic_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

}
