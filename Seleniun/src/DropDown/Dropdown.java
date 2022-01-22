package DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Nikhil");
		WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
		lastname.sendKeys("Badalu");
		WebElement mail = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		mail.sendKeys("nikhil.badalu@gmail.com");
		WebElement sex = driver.findElement(By.xpath("//*[@name='sex' and @value='2']"));
		sex.click();
		List<WebElement> DropDay = driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
		for (WebElement day : DropDay) {
			if(day.getText().equalsIgnoreCase("15"))
				day.click();}
		
		List<WebElement> DropMonth = driver.findElements(By.xpath("//*[@name='birthday_month']//option"));
		for (WebElement month : DropMonth) {
			if(month.getText().equalsIgnoreCase("Aug"))
			month.click();}
		
		List<WebElement> DropYear = driver.findElements(By.xpath("//*[@name='birthday_year']//option"));
		for(WebElement Year : DropYear) {
			if(Year.getText().equalsIgnoreCase("1947"))
			Year.click();}
		
		WebElement password = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		password.sendKeys("123456789");
		Thread.sleep(3000);
		driver.quit();
	}
}

