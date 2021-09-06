package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage extends TestBase {
	
	
	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	// WebElements
		@FindBy(how = How.XPATH, using = "//*[@id=\"header-content\"]") WebElement HEADER_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[1]") WebElement SKY_BLUE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[2]") WebElement WHITE_BACKGROUND_ELEMENT;

		public void clickSkyBlueEleButton() {
			SKY_BLUE_ELEMENT.click();
		}
		
		public void skyBlueEleButtonIsDesplayed() {
			SKY_BLUE_ELEMENT.isDisplayed();
		}
		public void clickWhiteEleButton() {
			WHITE_BACKGROUND_ELEMENT.click();
		}
		public void whiteEleButtonIsDisplayed() {
			WHITE_BACKGROUND_ELEMENT.isDisplayed();
		}




}
