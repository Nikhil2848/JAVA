package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);   //go to frame
		
		WebElement source = driver.findElement(By.xpath("//div[@id='slider']//span"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(source, 300, 0).release().build().perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();  /// come out the frame
		driver.findElement(By.xpath("//li[@class='menu-item']//a[contains(text(),'Demo')]")).click();

}
}
