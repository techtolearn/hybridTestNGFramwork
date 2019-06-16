package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {

	@Test
	public void testHomePage(){
		WebDriver driver= BrowserFactory.getBrowser("Firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		
		homePage home = PageFactory.initElements(driver, homePage.class);
		home.clickOncloseButton();
		home.clickOnloginButton();
		String title = home.getApplicationTitle();
		System.out.println("Application title is  : "+title);
	}
}

