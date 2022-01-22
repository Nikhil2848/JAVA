package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop2 {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("(//li[@id='fourth']//a[@class='button button-orange'])[1]"));
		WebElement Destination = driver.findElement(By.xpath("//ol[@id='amt7']//li"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(Destination).release().build().perform();
	}

}
