package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends BaseClass {

	
	@FindBy(xpath = "//*[@id='welcome']")
	private WebElement click1;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement click2;
	
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LogOutMethod() {
		
		click1.click();
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(click2));
		click2.click();
	}
	

}
