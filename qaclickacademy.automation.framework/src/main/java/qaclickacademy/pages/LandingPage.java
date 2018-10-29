package qaclickacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	
	By clickHomePage = By.xpath("//a[contains(text(),'Home')]");
	
	By clickCouresePage = By.xpath("//a[text()='Courses']");
	
	By clickVideosPage = By.xpath("//a[contains(text(),'Videos')]");
	
	By clickInterviewGuidePage = By.xpath("//a[text()='Interview Guide']");
	
	By clickPractisePage = By.xpath("//a[contains(text(),'Practice')]");
	
	By clickBlogPage = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[1]");

	By clickAboutPage = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a[@href='about.php'][contains(text(),'About')]");
	
	By clickContactPage = By.xpath("//a[contains(text(),'Contact')]");
	
	By clickRegisterPage = By.xpath("//span[contains(text(),'Register')]");
	
	By clickLoginPage = By.xpath("//span[contains(text(),'Login')]");
	
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement homePage()
	{
		return driver.findElement(clickHomePage);
	}
	
	
	public WebElement coursesPage()
	{
		return driver.findElement(clickCouresePage);
	}
	
	
	public WebElement videoPage()
	{
		return driver.findElement(clickVideosPage);
	}
	
	public WebElement interviewGuidePage()
	{
		return driver.findElement(clickInterviewGuidePage);
	}
	
	public WebElement practisePage()
	{
		return driver.findElement(clickPractisePage);
	}
	
	
	
	public WebElement blogPage()
	{
		return driver.findElement(clickBlogPage);
	}
	
	public WebElement aboutPage()
	{
		return driver.findElement(clickAboutPage);
	}
	
	public WebElement contactPage()
	{
		return driver.findElement(clickContactPage);
	}
	
	
	public WebElement registerPage()
	{
		return driver.findElement(clickRegisterPage);
	}
	
	public WebElement loginPage()
	{
		return driver.findElement(clickLoginPage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
