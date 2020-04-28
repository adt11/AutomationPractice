package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Actions.HomePageActions;
import utils.SeleniumDriver;

public class HomePageSteps {
	
	HomePageActions homePageActions = new HomePageActions();
	
	@Given("I open the URL {string}")
	public void i_open_the_URL(String website) {
	    
		SeleniumDriver.openPage(website);
	}

	@When("I click on contact us button")
	public void i_click_on_contact_us_button() {
	    
		homePageActions.click_Contact_Us();
	}

	@Then("I should see the title of the page {string}")
	public void i_should_see_the_title_of_the_page(String title) {
		
		homePageActions.verify_Current_Page_Title(title);
	}
	
	@When("I click on Sign In button")
	public void i_click_on_Sign_In_button() {
	    
		homePageActions.click_SignIN();
	}

	@When("I move to the Women Menu")
	public void i_move_to_the_Women_Menu() {
	   
		homePageActions.move_To_Women_Menu();
	}

	@And("I click on Tops Link")
	public void i_click_on_Tops_Link() {
		
		homePageActions.click_Tops_Women_Menu();
	}

	@And("I click on Dresses Link")
	public void i_click_on_Dresses_Link() {
	   
		homePageActions.click_Dresses_Women_Menu();
	}

	@And("I click on TShirts Link")
	public void i_click_on_TShirts_Link() {
	    
		homePageActions.click_TShirts_Tops_Women_Menu();
	}

	@And("I click on Blouses Link")
	public void i_click_on_Blouses_Link() {
	    
		homePageActions.click_Blouses_Tops_Women_Menu();
	}

	@And("I click on Casual Dresses Link")
	public void i_click_on_Casual_Dresses_Link() {
	   
		homePageActions.click_Casual_Dresses_Women_Menu();
	}

	@And("I click on Evening Dresses Link")
	public void i_click_on_Evening_Dresses_Link() {
	    
		homePageActions.click_Evening_Dresses_Women_Menu();
	}

	@And("I click on Summer Dresses Link")
	public void i_click_on_Summer_Dresses_Link() {
		homePageActions.click_Summer_Dresses_Women_Menu();
	}
	
	@When("I move to the Dresses Menu")
	public void i_move_to_the_Dresses_Menu() {
	    
		homePageActions.move_To_Dresses_Menu();
	}

	@When("I click on Casual Dresses submenu")
	public void i_click_on_Casual_Dresses_submenu() {
	    
		homePageActions.click_Casual_Dresses_Menu();
	}

	@When("I click on Evening Dresses submenu")
	public void i_click_on_Evening_Dresses_submenu() {

		homePageActions.click_Evening_Dresses_Menu();
	}

	@When("I click on Summer Dresses submenu")
	public void i_click_on_Summer_Dresses_submenu() {
		
		homePageActions.click_Summer_Dresses_Menu();
	}
	
	@When("I move to the TShirts Menu")
	public void i_move_to_the_TShirts_Menu() {
	   
		homePageActions.move_To_TShirts_Menu();
	}


}
