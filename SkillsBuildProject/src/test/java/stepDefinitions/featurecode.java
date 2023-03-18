package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FeaturecodePage;
import pageObjects.RegisterPage;
import utils.TestContextSetup;

public class featurecode {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public FeaturecodePage featurecode;
	
	public featurecode(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.featurecode = testContextSetup.pageObjectManager.getFeaturecodePage();
	}
	
	 @Given("^User on the home Page$")
	    public void im_on_the_home_page() throws Throwable {
		 System.out.println("Opened Home page");
	        
	 }
	
	 @Then("^Login as faculty with id \"([^\"]*)\"and pwd \"([^\"]*)\"$")
	    public void login_as_faculty_with_id_somethingand_pwd_something(String strArg1, String strArg2) throws Throwable {
		// RegisterPage registre = new RegisterPage(driver);
		 //registre.ClickRegister(strArg1);
		 featurecode.Logintoportal(strArg1, strArg2);
	    }
 
    @And("^Click on Topics IBM cloud page$")
    public void click_on_topics_ibm_cloud_page() throws Throwable {
        featurecode.Cloudclick();
    }
    
    @And("^Click on software featurecode card$")
    public void click_on_software_featurecode_card() throws Throwable {
    	 featurecode.featureCardclick();
    	//System.out.println("feature");
    }
    
    @Then("^Check featurecode$")
    public void check_featurecode() throws Throwable {
    	featurecode.checkFeaturecode();
    	
    }


}
