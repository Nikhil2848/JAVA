package Test_Java;

import org.testng.annotations.Test;

public class Login_Test extends Base_Test {
	
	@Test(priority=1)
	public void verifyLoginWithCorrectCred() {
		login.login();
	}
	
	@Test(priority=2)
	public void verifyTitleOfLoginPage() {
		login.verifyPageTitle("OrangeHRM");
	}
	
	@Test(priority=-1)
	public void verifyLoginPageUrl() {
		login.verifyPageUrl("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=0)
	public void verifyLoginBtnIsClickable() {
		login.verifyLoginBtnClickable();
	}
	

}
