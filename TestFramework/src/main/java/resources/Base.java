package resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	public WebDriver driver;
	public Properties data = new Properties();
	String path = System.getProperty("user.dir");
	
	public WebDriver getDriver() {
		if (System.getProperty("browser").equals("chrome")) {
			FileInputStream input;
			try {
				path = path + "//src//main//java//resources//testdata.properties";
				System.out.println("url path = "+ path);

				input = new FileInputStream(path);
				data.load(input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	} else if (System.getProperty("browser").equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
}
