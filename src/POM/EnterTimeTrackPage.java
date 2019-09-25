package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import junit.framework.Assert;

public class EnterTimeTrackPage {
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyHPDisplayed (WebDriver driver, long ETO, String title) {
		try { 
			WebDriverWait wait = new WebDriverWait(driver, ETO);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("home page displayed", true);
			
		} catch (Exception e) {
			Reporter.log("home page is not displayed", true);
			Assert.fail();
		}
	}

}
