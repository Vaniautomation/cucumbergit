package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.GenericUtils;

public class FeaturecodePage {
	
	
	public WebDriver driver;
	public RegisterPage register;
	
	public RegisterPage RegisterPage;
	GenericUtils utils = new GenericUtils(driver);

	public FeaturecodePage(WebDriver driver)
	{
		this.driver = driver;
		
		
	}
	
	By  registerLink= By.xpath("//button[@copy='Register now']");
	By acceptall =By.xpath("//button[@id='truste-consent-button']");
	By mail= By.xpath("//input[@id='univ_email']");
	By submit= By.xpath("//button[@class='bx--btn bx--btn--primary']");
	By urxid= By.xpath("//input[@id='username']");
	By urxcontinue= By.xpath("//*[@id=\"continue-button\"]");
	By urxpwd= By.xpath("//*[@id=\"password\"]");
	By urxloginBtn=By.xpath("//*[@id=\"signinbutton\"]");
	By topicslnk= By.xpath("//a[@aria-label='Topics']");
	By cloudlnk =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[3]/div[2]/div[1]/nav[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]");
	By software =By.xpath("//a[contains(text(),'Software')]");
	By softwarecards= By.xpath("//div[@class='bx--card__content']");
	By clodFClink= By.xpath("(//*[name()='svg'][@focusable='false'])[31]");
	By Fcodetext=By.xpath("//h3[contains(text(),'IBM Cloud Feature Code')]");
	By featurecodecardlnk = By.xpath("//a[@class='bx--link bx--card__footer']");
	By featurecodelnk= By.xpath("//a[normalize-space()='Request Feature Code']");
	By fcodetext= By.xpath("(//div[contains(text(),'Your IBM Cloud Promo Code is:')])[1]");
	By okbtn=By.xpath("//button[@class='bx--btn bx--btn--secondary']");
	
	By Featurecodefailmesg= By.xpath("//div[contains(text(),'Requested resource is currently unavailable, pleas')]");
	
	
	
		public void Logintoportal(String id, String pwd) throws InterruptedException 
		{
		
			driver.findElement(registerLink).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			if(driver.findElement(acceptall).isDisplayed()) {
				driver.findElement(acceptall).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
			}
			if(driver.findElement(mail).isEnabled()) {
				WebElement button = driver.findElement(mail);
				button.click();
				button.sendKeys(id);
			}
			
			driver.findElement(submit).click();
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			wait.until(ExpectedConditions.presenceOfElementLocated(urxid));	
driver.findElement(urxid).sendKeys(id);
driver.findElement(urxcontinue).click();
driver.findElement(urxpwd).sendKeys(pwd);
driver.findElement(urxloginBtn).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
}
		public void  Cloudclick() {
WebDriverWait wait = new WebDriverWait(driver, 10); 
wait.until(ExpectedConditions.presenceOfElementLocated(topicslnk));  
driver.findElement(topicslnk).click();

//locate the menu to hover over using its xpath
WebElement menu = driver.findElement(topicslnk);
//Initiate mouse action using Actions class
Actions builder = new Actions(driver);
//move the mouse to the earlier identified menu option
builder.moveToElement(menu).build().perform();
//wait for max of 5 seconds before proceeding.
//until this submenu is found
WebDriverWait wait1 = new WebDriverWait(driver, 5); 
wait1.until(ExpectedConditions.presenceOfElementLocated(cloudlnk));  
//identify menu option from the resulting menu display and click
WebElement menuOption = driver.findElement(cloudlnk);
menuOption.click();
driver.manage().window().maximize();

		}
		
		
		
		@SuppressWarnings("unlikely-arg-type")
		public void featureCardclick() {

			driver.findElement(software).click();

			driver.findElement(clodFClink).click();
		}
		
		public void checkFeaturecode() {
driver.findElement(featurecodelnk).click();
String tempcode= driver.findElement(fcodetext).getText().toString();
System.out.println("Feature code"+ tempcode);
driver.findElement(okbtn).click();
//driver.close();
		}
		public void checkFeaturecodefail() {
			driver.findElement(featurecodelnk).click();
			String tempcode= driver.findElement(Featurecodefailmesg).getText().toString();
			System.out.println("Feature code fail message"+ tempcode);
			//driver.close();;
			
			
		}


	}



		



