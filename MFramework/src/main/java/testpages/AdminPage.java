package testpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BaseClass {

	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
	private WebElement Adminclick1;

	@FindBy(xpath = "//*[@id='menu_admin_UserManagement']")
	private WebElement Adminclick2;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkbox() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(Adminclick1));
		Adminclick1.click();
		wait.until(ExpectedConditions.elementToBeClickable(Adminclick2));
		Adminclick2.click();
		List<WebElement> check = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		for (WebElement ck : check)
			ck.click();
	}
}
