package pages.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import pages.Locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

	private HomePageLocators homePageLocators = null;
	
	public HomePageActions() {
		
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}
	
	public void go_To_Home_Page() {
		
		homePageLocators.homelink.click();
	}
	
	public void click_Contact_Us() {
		
		homePageLocators.contactUS.click();
	}
	
	public void click_SignIN() {
		
		homePageLocators.signIN.click();
	}
	
	public void SearchQuery(String query) {
		
		homePageLocators.searchTxtBox.sendKeys(query);
		homePageLocators.searchBtn.click();
	}
	
	public void move_To_Women_Menu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.womenMenu).perform();
	}
	
	public void click_Tops_Women_Menu() {
		
		homePageLocators.tops_Women_Menu.click();
	}
	
	public void click_TShirts_Tops_Women_Menu() {
		
		homePageLocators.tshirts_tops_Women_Menu.click();
	}

	public void click_Blouses_Tops_Women_Menu() {
	
		homePageLocators.blouse_tops_Women_Menu.click();
	}
	
	public void click_Dresses_Women_Menu() {
		
		homePageLocators.dresses_Women_Menu.click();
	}
	
	public void click_Casual_Dresses_Women_Menu() {
			
			homePageLocators.casual_Dresses_Women_Menu.click();
		}
	
	public void click_Evening_Dresses_Women_Menu() {
		
		homePageLocators.evening_Dresses_Women_Menu.click();
	}
	
	public void click_Summer_Dresses_Women_Menu() {
		
		homePageLocators.summer_Dresses_Women_Menu.click();
	}
	
	public void move_To_Dresses_Menu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.dressesMenu).perform();
	}
	
	public void click_Casual_Dresses_Menu() {
		
		homePageLocators.casual_Dresses_Menu.click();
	}
	
	public void click_Evening_Dresses_Menu() {
		
		homePageLocators.evening_Dresses_Menu.click();
	}
	
	public void click_Summer_Dresses_Menu() {
		
		homePageLocators.summer_Dresses_Menu.click();
	}	
	
	public void move_To_TShirts_Menu() {
		
		homePageLocators.tshirtsMenu.click();
	}
	
	public void verify_Current_Page_Title(String title) {
		
		SeleniumDriver.waitElement().until(ExpectedConditions.titleIs(title));
		Assert.assertTrue(SeleniumDriver.getDriver().getTitle().equalsIgnoreCase(title));
		
	}
	

}
