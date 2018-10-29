package qaclickacademy.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaclickacademy.base.BaseClass;

import qaclickacademy.pages.RegisterPage;

public class RegisterPageTestCases extends BaseClass{
	
	
	RegisterPage rp;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver = invokeBrowser();
		rp =new RegisterPage(driver);
	}
	
	@Test
	public void verifyRegPage() throws IOException
	{
		
		
		rp.registerButton().click();
		rp.fullName().sendKeys("Seraj Islam");
		rp.email().sendKeys("seraj_islam02@yahoo.com");
		rp.password().sendKeys("Bina123");
		rp.confirmPass().sendKeys("Bina123");
		rp.promoEmail().click();
		rp.termsCondition().click();
		rp.signUpButton().click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
