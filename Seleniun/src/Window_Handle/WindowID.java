package Window_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowID {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Primeryscreen = driver.getWindowHandle();
		System.out.println("Primary Window Id :"+ Primeryscreen);
		
		driver.findElement(By.xpath("//div//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(8000);
		Set<String> AllId = driver.getWindowHandles();
		for(String eachid:AllId)
			
		driver.switchTo().window(eachid);
		driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("9923272848");
			
	}

}
