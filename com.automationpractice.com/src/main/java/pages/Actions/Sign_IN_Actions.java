package pages.Actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Locators.Sign_IN_Locators;
import utils.SeleniumDriver;

public class Sign_IN_Actions {

	private Sign_IN_Locators sign_IN_Locators = null;
	
	public Sign_IN_Actions() {
		
		sign_IN_Locators = new Sign_IN_Locators();
		PageFactory.initElements(SeleniumDriver.getDriver(), sign_IN_Locators);
	}
	
	public void setUserName(String User) {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.email));
		sign_IN_Locators.email.sendKeys(User);
	}
	
	public void setPassWord(String Pass) {
		
		sign_IN_Locators.passwd.sendKeys(Pass);
	} 
	
	public void click_SignIN() {
		
		sign_IN_Locators.Submit_Login.click();
	}
	
	public void click_Forgot_Link() {
		
		sign_IN_Locators.forgot_Link.click();
	}
	
	public void click_Sign_Out() {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.logOut));
		sign_IN_Locators.logOut.click();
	}
	
	public void click_Retrieve_Password() {
			
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.Retrieve_Password));	
		sign_IN_Locators.Retrieve_Password.click();
		}
	
	public void click_Forgot_Confirmation_Message(String message) {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.confirmation_forgot_message));
		Assert.assertTrue(sign_IN_Locators.confirmation_forgot_message.getText().contains(message));
	}
	
	public void verify_login_successfully() {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.logOut));
		Assert.assertTrue(sign_IN_Locators.logOut.isDisplayed());
	}
	
	public void verify_logout_successfully() {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.email));
		Assert.assertTrue(sign_IN_Locators.email.isDisplayed());
	}
	
	public void verify_failed_message(String message) {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.visibilityOf(sign_IN_Locators.failed_message));
		Assert.assertTrue(sign_IN_Locators.failed_message.getText().contains(message));
	}
}
