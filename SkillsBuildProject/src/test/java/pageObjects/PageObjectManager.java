package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class PageObjectManager {
	
	
	public WebDriver driver;
	public RegisterPage RegisterPage;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
		
	}

	
	
	
	public RegisterPage getRegisterPage()
	{
		RegisterPage = new RegisterPage(driver);
		return RegisterPage;
	}
	
	public FeaturecodePage getFeaturecodePage()
	{
		FeaturecodePage FeaturecodePage = new FeaturecodePage(driver);
		return FeaturecodePage;
	}
	
	
}
