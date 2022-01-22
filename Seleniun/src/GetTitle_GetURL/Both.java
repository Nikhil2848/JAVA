package GetTitle_GetURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Both {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if(title.equals("OrangeHRM"))
			System.out.println("Passed"+title);
		else
			System.out.println("Failed"+title);
		String URL = driver.getCurrentUrl();
		if(URL.equals("https://opensource-demo.orangehrmlive.com/"))
			System.out.println("Passed :"+URL);
		else
			System.out.println("Failed :"+URL);
	}

}
