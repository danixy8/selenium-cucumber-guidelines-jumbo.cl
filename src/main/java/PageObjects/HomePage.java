package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.BaseDriverClass;

public class HomePage extends BaseDriverClass {

	@FindBy(xpath = "//span[contains(text(),'Products')]")
	@CacheLookup
	private WebElement homepageHeader;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public Boolean verifyOnHomePage() {
		waitUntilElementVisible(homepageHeader);
		return homepageHeader.isDisplayed();
	}
}
