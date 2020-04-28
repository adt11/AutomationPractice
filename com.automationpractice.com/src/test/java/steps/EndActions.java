package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class EndActions {

	@After
	public static void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
	        try {
	        	 scenario.write("Current Page URL is " + SeleniumDriver.getDriver().getCurrentUrl());
	            byte[] screenshot = ((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png", "FailedScreenshot");
	        } catch (WebDriverException webdriverException) {
	            System.err.println(webdriverException.getMessage());
	        }
        } 
		SeleniumDriver.tearDown();
	}
}
