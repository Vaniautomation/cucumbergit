package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.PendingException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;
import pageObjects.RegisterPage;



public class register {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public RegisterPage register;
	
	public register(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.register = testContextSetup.pageObjectManager.getRegisterPage();
	}

	 @Given("^I'm on the home Page$")
	    public void im_on_the_home_page() throws Throwable {
		 System.out.println("Opened Home page");
	        
	 }
	
	 @Then("^Click Register and Enter \"([^\"]*)\"$")
	    public void click_register_and_enter_email_id(String emailid) throws Throwable {
		 register.ClickRegister(emailid);
	      // System.out.println("testgiven");
	    }

    @When("^I select role as \"([^\"]*)\"$")
    public void i_select_role_as_faculty(String role) throws Throwable {
    	register.selectRole(role);
    }


    @Then("^Enter Title,Current degree,Department,agreeTerms,agreePrivacyconsent and register$")
    public void enter_titlecurrent_degreedepartmentagreetermsagreeprivacyconsent() throws Throwable {
    	register.enterAllFields();
    }

   

    @And("^Register id in urx \"([^\"]*)\"$")
    public void register_id_in_urx(String id) throws Throwable {
    	register.registerURX(id);
        
    }
    
    @Then("^Enter currentdegree,soughtdegree,expectedgradutationdate,month and department$")
    public void enter_currentdegreesoughtdegreeexpectedgradutationdatemonth_and_department() throws Throwable {
        register.studentrole();
    }
}
