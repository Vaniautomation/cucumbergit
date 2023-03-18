package pageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.GenericUtils;



public class RegisterPage {
	public WebDriver driver;
	public RegisterPage register;
	
	public RegisterPage RegisterPage;
	GenericUtils utils = new GenericUtils(driver);

	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		
		
	}
	


	By  registerLink= By.xpath("//button[@copy='Register now']");
	By acceptall =By.xpath("//button[@id='truste-consent-button']");
	By mail= By.xpath("//input[@id='univ_email']");
	By submit= By.xpath("//button[@class='bx--btn bx--btn--primary']");
	By selectrole= By.xpath("//*[@id=\"select-role\"]");
	
	By title=By.xpath("//input[@name='userTitle']");
	By degree=By.xpath("//select[@name='degree']");
	By dept=By.xpath("//select[@name='department']");
	By sd=By.linkText("Software Downloads terms of service");
	By privacy=By.linkText("privacy consent");
	By overlaybtn= By.xpath("//button[@class='bx--btn bx--btn--primary']");
	By clickhere= By.xpath("//*[contains(text()='click here.']))");
	
	By urxemailid=By.xpath("//*[@id=\"email\"]");
	By urxfn=By.xpath("//*[@id=\"firstName\"]");
	By urxln=By.xpath("//*[@id=\"lastName\"]");
	By urxpwd = By.xpath("//*[@id=\"password\"]");
	By urxcountry =By.xpath("//*[@id=\"country\"]");
	By urxcomp = By.xpath("//*[@id=\"company\"]");
	By urxnextbtn=By.xpath("//button[@type=\"submit\"]");
	By  verifycode= By.xpath("//*[@id=\"token\"]");
	By  urxsubmitbtn=By.xpath("//button[@type='submit']");
	By proceedbtn=By.xpath("//button[contains(text(),'Proceed')]");
	
	By mailisearch =By.xpath("//*[@id=\"search\"]");
	 By btngo = By.xpath("//button[contains(text(),'GO')]");
	 By mailid= By.xpath("//td[contains(text(),'  IBM Security')]");
	 By code =By.tagName("h2");
	 
	 //Student
	 By currentDegree = By.xpath("//*[@id=\"select-degree\"]");
	 By soughtDegree = By.xpath("//*[@id=\"select-soughtdegree\"]");
	 By expecteddate= By.xpath("//*[@id=\"select-graduation-date\"]");
	 By expectedmonth= By.xpath("//*[@id=\"select-graduation-month\"]");
	 By department =By.xpath("//*[@id=\"select-department\"]");
	 
	 
	 

		

	
	public void ClickRegister(String emailid)
	{
		
		
		driver.findElement(registerLink).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		if(driver.findElement(acceptall).isDisplayed()) {
			driver.findElement(acceptall).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
		}
		if(driver.findElement(mail).isEnabled()) {
			WebElement button = driver.findElement(mail);
			button.click();
			button.sendKeys(emailid);
		}
		
		driver.findElement(submit).click();
		
	}
	

	public void selectRole(String role1) {
	
	Select dropRole = new Select(driver.findElement(selectrole));
	utils.selectDisplaytext(dropRole, role1);

		
	}
	
	
	public void enterAllFields() throws InterruptedException {
		String dg="High School";
		//driver.findElement(title).click();
		driver.findElement(title).sendKeys("test title");
		
		Select deg = new Select(driver.findElement(degree));
		utils.selectDisplaytext(deg, dg);
		
		Select dep1= new Select(driver.findElement(dept));
		utils.selectDisplaytext(dep1, "Aerospace");
		
		driver.findElement(sd).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(privacy).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(clickhere).click();
		
		
		
		
	}
	
	
	public void registerURX(String id) {
		
		driver.findElement(urxemailid).sendKeys(id);
		driver.findElement(urxfn).sendKeys("fn");
		driver.findElement(urxln).sendKeys("fn");
		driver.findElement(urxpwd).sendKeys("Welcome2ibm1234");
		driver.findElement(urxnextbtn).click();
		driver.findElement(urxcomp).sendKeys("IBM");
		String parent=driver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.linkText("https://www.mailinator.com/")).sendKeys(selectLinkOpeninNewTab);
		driver.findElement(mailisearch).sendKeys(id);
		driver.findElement(btngo).click();
		driver.findElement(mailid).click();
		String temp = driver.findElement(code).getText();
		utils.switchToParent(parent);
		driver.findElement(verifycode).sendKeys(temp);
		driver.findElement(urxsubmitbtn).click();
		driver.findElement(proceedbtn).click();
		
		
		
	}


	public void studentrole() {
		String dg = "High School";
		Select deg = new Select(driver.findElement(currentDegree));
		utils.selectDisplaytext(deg, dg);
		
		Select sdeg = new Select(driver.findElement(soughtDegree));
		utils.selectDisplaytext(sdeg, dg);
		
		Select expdate = new Select(driver.findElement(expecteddate));
		String date1="2024";
		utils.selectDisplaytext(expdate, date1);
		
		Select expdateMon = new Select(driver.findElement(expectedmonth));
		String mon="Mar";
		utils.selectDisplaytext(expdateMon, mon);
		
		Select dep1= new Select(driver.findElement(dept));
		utils.selectDisplaytext(dep1, "Aerospace");
		
		
		driver.findElement(sd).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(privacy).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(overlaybtn).click();
		driver.findElement(overlaybtn).click();
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
}
