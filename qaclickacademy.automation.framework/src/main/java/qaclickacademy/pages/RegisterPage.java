package qaclickacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	
	public WebDriver driver;
	
	By clickOnRegisterButton = By.xpath("//span[contains(text(),'Register')]");
	
	By enterFullName = By.id("user_name");
	
	By enterEmail = By.name("user[email]");
	
	By enterPassword = By.id("user_password");
	
	By confirmPassword = By.id("user_password_confirmation");
	
	By clickToAgreePromEmail = By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']");
	
	By clickToAgreeTC = By.id("user_agreed_to_terms");
	
	By clickOnSignUp = By.xpath("//input[@value='Sign Up']");
	
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement registerButton()
	{
		return driver.findElement(clickOnRegisterButton);
	}
	
	
	public WebElement fullName ()
	{
		return driver.findElement(enterFullName);
	}
	
	public WebElement email ()
	{
		return driver.findElement(enterEmail);
	}
	
	public WebElement password ()
	{
		return driver.findElement(enterPassword);
	}
	
	public WebElement confirmPass ()
	{
		return driver.findElement(confirmPassword);
	}
	
	public WebElement promoEmail ()
	{
		return driver.findElement(clickToAgreePromEmail);
	}
	
	
	public WebElement termsCondition ()
	{
		return driver.findElement(clickToAgreeTC);
	}
	
	public WebElement signUpButton()
	{
		return driver.findElement(clickOnSignUp);
	}

}
