package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium don't delete\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		
		int i = 0;
		while(i==0)
		{
			WebElement text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			 String days = text.getText();
		System.out.println(days);
		if(!(days.equals("January 2000")))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    	}
		else
		{
			break;
		}
		}
		driver.findElement(By.xpath("//table//tr//td//a[text()='18']")).click();
	}
}

