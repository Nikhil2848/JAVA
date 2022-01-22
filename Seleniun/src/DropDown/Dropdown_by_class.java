package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_by_class {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Badalu");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("nikhil.badalu@gmail.com");
		driver.findElement(By.xpath("//*[@name='sex' and @value='2']")).click();
		
		WebElement day =driver.findElement(By.xpath("//*[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));

		Select selday = new Select(day);
		selday.selectByIndex(15);
		
		Select selmonth = new Select(month);
		selmonth.selectByValue("8");
		
		Select selyear = new Select(year);
		selyear.selectByVisibleText("1947");
	
}
}