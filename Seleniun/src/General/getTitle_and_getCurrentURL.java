package General;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_and_getCurrentURL {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		  String titleOfPage = driver.getTitle();    //  Test1 
		  if(titleOfPage.equals("OrangeHRM"))
			  
		  System.out.println("test is passed: "+titleOfPage);
		  else
			  System.out.println("test is failed: " + titleOfPage );
		  
		  String URL = driver.getCurrentUrl();     //Test2
		  if(URL.equals("https://opensource-demo.orangehrmlive.com/"))
			  System.out.println("test is passed: "+URL);
			  else
				  System.out.println("test is failed: " + URL );
		  Thread.sleep(1000);
		  driver.quit();

	}

	}

