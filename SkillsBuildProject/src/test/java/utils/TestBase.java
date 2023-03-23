package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.RegisterPage;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		//System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("QAUrl");
		//System.out.println(url);
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		String browser = browser_properties;
	//	String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//java//resources//chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);// driver gets the life
		
	
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	//	driver.manage().window().fullscreen();
		}
		
		return driver;
		
	}
	
	
	
}

