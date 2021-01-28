package Selenium_Boilerplate.TestFramework;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import resources.Base;

public class HomeTest extends Base{
	HomePage home;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
		driver = getDriver();
		home = new HomePage(driver);


	}

	@Test
	public void basicTest() {
		driver.get(data.getProperty("url"));
		home.getBasicExamples().click();
//		Assert.assertTrue(home.getBasicDisplay().isDisplayed());
	}
	
	@Test
	public void inputFormTest() throws InterruptedException {
		home.getSimpleFormLink().click();
		Assert.assertTrue(home.getSimpleFormTitle().isDisplayed());
		home.getEnterMessage().sendKeys("Hi, I am pooja");
		home.getShowMessage().click();
		Assert.assertEquals(home.getMessageText().getText(),"Hi, I am pooja");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	@AfterSuite
	public void afterSuite(){
		driver.quit();
	}
	
}
