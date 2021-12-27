package Main_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Test_Java.Base_Test;

public class hovering extends Base_Test {

	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
	private WebElement Admin;
	@FindBy(xpath = "//*[@id='menu_admin_UserManagement']")
	private WebElement manag;

	public hovering(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void chekbox() {
	Reporter.log("check box check",true);
	Admin.click();
	manag.click();
	List<WebElement> check = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
	for(WebElement ck:check)
		ck.click();
	
	
	}

}
