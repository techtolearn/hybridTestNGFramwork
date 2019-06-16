package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage {
	WebDriver driver;
	public homePage(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	@FindBy(css="button[class='2AkmmA _29YdH8']") WebElement closeButton;
	@FindBy(xpath="//a[@text(),'Login & Signup']") WebElement loginButton;

	public void clickOncloseButton(){
		closeButton.click();
	}
	public void clickOnloginButton(){
		loginButton.click();
	}
	public String getApplicationTitle(){
		return driver.getTitle();
		 
	}
}
	