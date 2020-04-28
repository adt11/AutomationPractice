package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="Contact us")
	public WebElement contactUS;
	
	@FindBy(how=How.LINK_TEXT,using="Sign in")
	public WebElement signIN;
	
	@FindBy(how=How.LINK_TEXT,using="Cart")
	public WebElement cartLink;
	
	@FindBy(how=How.XPATH,using="//*[@title='My Store']/child::img")
	public WebElement homelink;
	
	@FindBy(how=How.ID,using="search_query_top")
	public WebElement searchTxtBox;
	
	@FindBy(how=How.XPATH,using="//*[@type='submit' and @name='submit_search']")
	public WebElement searchBtn;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='Women']")
	public WebElement womenMenu;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='Dresses']")
	public WebElement dressesMenu;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='T-shirts']")
	public WebElement tshirtsMenu;
	
	@FindBy(how=How.XPATH,using="//*[@class='submenu-container clearfix first-in-line-xs']/child::li/a[@title='Tops']")
	public WebElement tops_Women_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@title='Tops']/parent::li/following-sibling::li/a")
	public WebElement dresses_Women_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@title='Tops']/following-sibling::ul/li/a[@title='T-shirts']")
	public WebElement tshirts_tops_Women_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@title='Tops']/following-sibling::ul/li/a[@title='Blouses']")
	public WebElement blouse_tops_Women_Menu;
	
	@FindBy(how=How.LINK_TEXT,using="Casual Dresses")
	public WebElement casual_Dresses_Women_Menu;
	
	@FindBy(how=How.LINK_TEXT,using="Evening Dresses")
	public WebElement evening_Dresses_Women_Menu;
	
	@FindBy(how=How.LINK_TEXT,using="Summer Dresses")
	public WebElement summer_Dresses_Women_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='Dresses']/following::ul/li/a[@title='Casual Dresses']")
	public WebElement casual_Dresses_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='Dresses']/following::ul/li/a[@title='Evening Dresses']")
	public WebElement evening_Dresses_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='Dresses']/following::ul/li/a[@title='Summer Dresses']")
	public WebElement summer_Dresses_Menu;
	
	@FindBy(how=How.XPATH,using="//*[@class='alert alert-warning']")
	public WebElement isEmptyCart;
	

}
