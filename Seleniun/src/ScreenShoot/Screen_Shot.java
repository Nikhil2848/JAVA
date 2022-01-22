package ScreenShoot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {
	
	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(3000);
		
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\SONY\\Pictures\\Saved Pictures.png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.quit();
	}
}
