package qaclickacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By clickOnPopUp = By.xpath("//div//div[@class='sumome-react-wysiwyg-popup-container sumome-react-wysiwyg-popup sumome-react-wysiwyg-is-resizing']//div//div[2]");
	
	By clickOnLoginButton = By.xpath("//a//i[@class='fa fa-lock fa-lg' and //span[text()='Login']]");
	
	By typeEmail = By.id("user_email");
	
	By typePassword = By.xpath("//input[@id='user_password']");
	
	By loginButton = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickPopUp()
	{
		return driver.findElement(clickOnPopUp);
	}
	public WebElement loginButton()
	{
		return driver.findElement(clickOnLoginButton);
	}
	
	public WebElement email()
	{
		return driver.findElement(typeEmail);
	}
	
	public WebElement password()
	{
		return driver.findElement(typePassword);
	}
	
	public WebElement login()
	{
		return driver.findElement(loginButton);
	}

}
