package StepDefinitions;

import Enums.DriverType;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.HomePage;
import PageObjects.LoginPage;

import java.time.Duration;

public class LoginDefinitionStep {
    private final LoginPage loginPage;
	private final HomePage homePage;

	public LoginDefinitionStep() throws Exception {
		loginPage = Hooks.testContext.getPageObjectManager().getLoginPage();
		homePage = Hooks.testContext.getPageObjectManager().getHomePage();
	}

	@Given("User is on login page {string}")
	public void loginPage(String url) {
		loginPage.goToWebpage(url);
		Assert.assertTrue(loginPage.verifyOnLoginPage());
	}

	@When("^User submit email and password$")
	public void submitEmailPassword() {
		loginPage.loginToSite("standard_user", "secret_sauce");
	}

	@Then("^User should be able to login sucessfully and new page open$")
	public void successLogin() {
		Assert.assertTrue(homePage.verifyOnHomePage());
	}
}
