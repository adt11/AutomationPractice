package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sign_IN_Locators {
	
/*
 * This section contains email, password forgot password link sign out and forgot confimation message	
 */
	@FindBy(how=How.ID,using="email")
	public WebElement email;
	
	@FindBy(how=How.ID,using="passwd")
	public WebElement passwd;
	
	@FindBy(how=How.LINK_TEXT,using="Forgot your password?")
	public WebElement forgot_Link;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	public WebElement Submit_Login;
	
	@FindBy(how=How.XPATH,using="//*[@class='logout' and @title='Log me out']")
	public WebElement logOut;
	
	@FindBy(how=How.ID,using="email")
	public WebElement forgot_Email;

	@FindBy(how=How.XPATH,using="//*[@class='btn btn-default button button-medium' and @type='submit']")
	public WebElement Retrieve_Password;
	
	@FindBy(how=How.XPATH,using="//*[@class='alert alert-success']")
	public WebElement confirmation_forgot_message;
	
	@FindBy(how=How.XPATH,using="//*[@class='alert alert-danger']/child::ol/li")
	public WebElement failed_message;
	
}
