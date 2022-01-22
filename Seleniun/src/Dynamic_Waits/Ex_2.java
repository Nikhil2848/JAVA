package Dynamic_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_2 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.titleContains("Selenium Webdriver"));
		System.out.println("Change text to Selenium Webdriver");
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		boolean view = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']"))).isDisplayed();
		System.out.println("Visible : "+view);
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']"))).click();

		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		WebDriverWait wait3 = new WebDriverWait(driver,80);
		boolean result = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']"))).isEnabled();
		System.out.println("ItisClickable : "+result);
		
		
		
		
		
		
		
	}

}
