package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	
	public static WebDriver driver;
	protected ChromeOptions options;
	protected LoginPage login;	
	protected LogoutPage logout;
	protected WebDriverWait wait;
	protected AdminPage check;
}
