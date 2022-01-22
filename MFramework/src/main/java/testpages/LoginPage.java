package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void loginmethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
		
	}

}
