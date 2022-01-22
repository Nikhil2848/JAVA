package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		
		Thread.sleep(1000);
		WebElement Dropyear = driver.findElement(By.xpath("//select[@title='Change the year']"));
		 Select year = new Select(Dropyear);
		 year.selectByVisibleText("2020");
		 
		WebElement Dropmonth = driver.findElement(By.xpath("//select[@title='Change the month']"));
		 Select month = new Select(Dropmonth);
		 month.selectByVisibleText("August");
		
		 Thread.sleep(1000);
		List<WebElement> DropDate = driver.findElements(By.xpath("//tbody//tr//td//a"));
		for(WebElement Date:DropDate) {
			String eachDate = Date.getText();
			System.out.println("eachDate");
			if(eachDate.equalsIgnoreCase("15"))
				Date.click();
		}
		
		
		
	
	}

}
