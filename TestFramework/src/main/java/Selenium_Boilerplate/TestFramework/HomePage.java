package Selenium_Boilerplate.TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	By basic = new By.ById("basic_example");
	By basicWindow = new By.ById("basic");
	By simpleForm = new By.ByLinkText("Simple Form Demo");
	By simpleFormTitle = new By.ByXPath("//div[normalize-space()='Single Input Field']");
	By enterMessage = new By.ByXPath("//input[@id='user-message']");
	By showMessage = new By.ByXPath("//button[normalize-space()='Show Message']");
	By showMessageText = new By.ByCssSelector("#display");
	
	public WebElement getBasicExamples() {
		return driver.findElement(basic);
	}
	public WebElement getBasicDisplay() {
		return driver.findElement(basicWindow);
	}
	public WebElement getSimpleFormLink() {
		return driver.findElement(simpleForm);
	}
	public WebElement getSimpleFormTitle() {
		return driver.findElement(simpleFormTitle);
	}
	public WebElement getEnterMessage() {
		return driver.findElement(enterMessage);
	}
	public WebElement getShowMessage() {
		return driver.findElement(showMessage);
	}
	public WebElement getMessageText() {
		return driver.findElement(showMessageText);
	}

}
