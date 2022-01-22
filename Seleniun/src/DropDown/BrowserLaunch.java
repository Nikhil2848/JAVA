package DropDown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	static WebDriver driver;
	  public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		  System.setProperty("webdriver.Firefiox.driver","C:\\Selenium don't delete\\chromedriver.exe");
	
		  				String browser = "Chrome";
		  
    	  if(browser.equals("Chrome")) driver = new ChromeDriver();
    	  if(browser.equals("ff")) driver = new FirefoxDriver();
    	  
    	   		
    	   		driver.get("https://www.google.com/");
    	   		
    	   	
    	   		driver.manage().window().maximize();
    	   		Thread.sleep(5000);
    	   		
    	   		driver.navigate().refresh();
    	   		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
    	   		
    	   		
    	   	
    	   		
    	   		
	
	  }
}
