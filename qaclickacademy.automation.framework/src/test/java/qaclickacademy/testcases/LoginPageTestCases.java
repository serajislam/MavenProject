package qaclickacademy.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaclickacademy.base.BaseClass;

import qaclickacademy.pages.LoginPage;

public class LoginPageTestCases extends BaseClass{

	
	LoginPage lPage;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver = invokeBrowser();
		lPage = new LoginPage(driver);
	}
	
	
	@Test
	public void verifyLoginPage() throws InterruptedException 
	{
		
		
		Thread.sleep(3000);
		lPage.clickPopUp().click();
		lPage.loginButton().click();
		lPage.email().sendKeys("serajislam1988@gmail.com");
		lPage.password().sendKeys("Bina123");
		lPage.login().click();
		
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "QaClickAcademy");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
