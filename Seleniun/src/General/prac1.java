package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prac1 {
	
	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver","C:\\Selenium don't delete\\geckodriver.exe");
		String browser = "ff";
		
		if(browser.equals("Chrome"))
			driver = new ChromeDriver();
		
		if(browser.equals("ff"))
			driver = new FirefoxDriver();
	}
	

}
