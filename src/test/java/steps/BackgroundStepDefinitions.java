package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import page.BackgroundColorPage;
import page.TestBase;

public class BackgroundStepDefinitions extends TestBase{
	BackgroundColorPage backgroundColorPageObj;
	
	

	@Before
	public void beforeRun()
	{
		
		initDriver();
		backgroundColorPageObj = PageFactory.initElements(driver, BackgroundColorPage.class);
		
		
	}
	@Given("^user is on Cucumber project Page$")
	public void user_is_on_Cucumber_project_Page()  {
		driver.get( "http://techfios.com/test/101/");
	}
	
	@And("^SkyBlue Background Button Exist$")
	public void skyblue_Background_Button_Exist()  {
		backgroundColorPageObj.skyBlueEleButtonIsDesplayed();
	}

	@When("^user click SkyBlue Background boutton$")
	public void user_click_SkyBlue_Background_boutton() {
		backgroundColorPageObj.clickSkyBlueEleButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		backgroundColorPageObj.takeScreenshot(driver);
		Thread.sleep(2000);
	}

	@Given("^White background button exist$")
	public void white_background_button_exist() throws Throwable {
		backgroundColorPageObj.whiteEleButtonIsDisplayed();
	}
	

	@When("^I click on the button$")
	public void i_click_on_the_button()  {
		backgroundColorPageObj.clickWhiteEleButton(); 
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable  {
		backgroundColorPageObj.takeScreenshot(driver);
		Thread.sleep(2000);
	}


	
	
	
	
}