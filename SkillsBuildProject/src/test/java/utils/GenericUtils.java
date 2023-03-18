package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	

	


	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	


	public void selectDisplaytext(Select dropRole, String role1) {
		// TODO Auto-generated method stub
		dropRole.selectByVisibleText(role1);
		
	}
	
	public void switchToParent(String parent) {
		driver.switchTo().window(parent);
		
	}


	public void waitforint(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		//return driver;
		
	}
	
}
