package steps;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Actions.Sign_IN_Actions;

public class Sign_IN_Steps {

	Sign_IN_Actions sign_IN_Actions = new Sign_IN_Actions();
	
	/*
	 *  This section contains Login methods
	 */
	@When("I enter valid user name and password")
	public void i_enter_valid_user_name_and_password(List<String> list) {

		System.out.println("User Name is: "+list.get(0));
		sign_IN_Actions.setUserName(list.get(0));
		System.out.println("User Name is: "+list.get(1));
		sign_IN_Actions.setPassWord(list.get(1));
	}
	
	@Then("I should able to see sign out button")
	public void i_should_able_to_see_sign_out_button() {
		
		sign_IN_Actions.verify_login_successfully();
	}

	@Then("I should back to login page successfully")
	public void i_should_back_to_login_page_successfully() {
	    
		sign_IN_Actions.verify_logout_successfully();
	}

	@When("I click on Log In button")
	public void i_click_on_Login_In_button() {
	    
		sign_IN_Actions.click_SignIN();
	}

	@Then("I click on Log Out button")
	public void i_click_on_Log_Out_button() {
	    
		sign_IN_Actions.click_Sign_Out();
	}
	
/*
 *  This section contains forgot password methods
 */
	
	@When("I click on forgot link")
	public void i_click_on_forgot_link() {
	    
		sign_IN_Actions.click_Forgot_Link();
	}

	@When("I enter registered user name")
	public void i_enter_registered_user_name(List<String> email) {
	    
		System.out.println("forgot email is : "+email.get(0));
		sign_IN_Actions.setUserName(email.get(0));
	}

	@When("I click retrive password button")
	public void i_click_retrive_password_button() {
	    
		sign_IN_Actions.click_Retrieve_Password();
	}

	@When("Message should be {string}")
	public void message_should_be(String message) {
	    
		sign_IN_Actions.click_Forgot_Confirmation_Message(message);
	}
	
	@When("Error message should appear {string}")
	public void Error_message_should_appear(String message) {
	    
		sign_IN_Actions.verify_failed_message(message);
	}
}
