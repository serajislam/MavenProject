package qaclickacademy.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaclickacademy.base.BaseClass;

import qaclickacademy.pages.LandingPage;

public class LandingPageTestCases extends BaseClass {

	LandingPage lp;

	@BeforeMethod
	public void setup() throws IOException {
		driver = invokeBrowser();
		lp = new LandingPage(driver);
	}

	@Test(priority = 1)
	public void verifyLandingPage() throws IOException, InterruptedException {

		lp.homePage().click();
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle,
				"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");

		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void verifyCoursePage() throws IOException, InterruptedException {

		lp.coursesPage().click();
		String coursePageTitle = driver.getTitle();
		Assert.assertEquals(coursePageTitle, "QAClick Academy | All Courses");

		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void verifyVideoPage() throws IOException, InterruptedException {

		lp.videoPage().click();
		String videoPageTitle = driver.getTitle();
		Assert.assertEquals(videoPageTitle, "QAClick Academy | Video Galery");

		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void verifyinterviewGuidePage() throws IOException, InterruptedException {

		lp.interviewGuidePage().click();
		String interviewGuidePageTitle = driver.getTitle();
		Assert.assertEquals(interviewGuidePageTitle, "QAClick Academy | Interview Guide");

		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void verifypractisePage() throws IOException, InterruptedException {

		lp.practisePage().click();
		String practisePageTitle = driver.getTitle();
		Assert.assertEquals(practisePageTitle, "Practice Page");

		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void verifyblogPage() throws IOException, InterruptedException {

		lp.blogPage().click();
		String blogPageTitle = driver.getTitle();
		Assert.assertEquals(blogPageTitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");

		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void verifyaboutPage() throws IOException, InterruptedException {

		lp.aboutPage().click();
		String aboutPageTitle = driver.getTitle();
		Assert.assertEquals(aboutPageTitle, "QAClick Academy | About Us");

		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void verifycontactPage() throws IOException, InterruptedException {

		lp.contactPage().click();
		String contactPageTitle = driver.getTitle();
		Assert.assertEquals(contactPageTitle, "QAClick Academy | Contact Us");

		Thread.sleep(3000);

	}

	@Test(priority = 9)
	public void verifyregisterPage() throws IOException, InterruptedException {

		lp.registerPage().click();
		String registerPageTitle = driver.getTitle();
		Assert.assertEquals(registerPageTitle, "QaClickAcademy");

		Thread.sleep(3000);

	}

//	@Test(priority = 10)
//	public void verifyloginPage() throws IOException, InterruptedException {
//
//		lp.loginPage().click();
//		String loginPageTitle = driver.getTitle();
//		Assert.assertEquals(loginPageTitle, "QaClickAcademy");
//
//		Thread.sleep(3000);
//
//	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
