package Window_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Primeryscreen = driver.getWindowHandle();
		System.out.println("Primary Window Id :"+ Primeryscreen);
		driver.findElement(By.xpath("//div//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(2000);
		Set<String> AllId = driver.getWindowHandles();
		for(String eachid:AllId)
		{
			driver.switchTo().window(eachid);
			if(driver.getTitle().contains("OrangeHRM HR Software | Free HR Software | HRMS | HRIS"))//u wil get when inspcet and find title
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li//a[contains(text(),'Contact Sales')]")).click();
			}
		}
		driver.switchTo().window(Primeryscreen);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.quit();
}
}
