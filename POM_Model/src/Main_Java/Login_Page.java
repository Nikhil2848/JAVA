package Main_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Test_Java.Base_Test;

public class Login_Page extends Base_Test {

	// Write All variables(locators) together on page
	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement btnLogin;

	// Initialization of driver and variable (data members)
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		Reporter.log("login with correct cred", true);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
	}

	public String verifyPageTitle(String pageTitle) {
		String title = driver.getTitle();
		Assert.assertEquals(title, pageTitle);
		return title;
	}

	public boolean verifyLoginBtnClickable() {
		return btnLogin.isEnabled();
	}

	public String verifyPageUrl(String pageUrl) {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, pageUrl);
		return url;
	}

}
