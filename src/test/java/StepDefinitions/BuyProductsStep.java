package StepDefinitions;

import Enums.DriverType;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.BuyProductsPage;

import java.time.Duration;

public class BuyProductsStep {

    private final BuyProductsPage buyProductsPage;

    public BuyProductsStep() throws Exception {
        buyProductsPage = Hooks.testContext.getPageObjectManager().getBuyProductsPage();
    }

    @Given("login to the jumbo site {string}")
    public void startBrowser (String url) {buyProductsPage.goToWebpage(url);}

    @When("Click on: Search")
    public void clickSearchBtn() {buyProductsPage.clickSearchBtn();}

    @And("Write on search {string}")
    public void writeOnSearch(String txtSearch){buyProductsPage.writeOnSearch(txtSearch);}

    @And("Click on: Always night towels")
    public void clickAddProduct1(){
        buyProductsPage.clickAddProduct1();
    }

    @And("Click on: Kotex ultra fine towels")
    public void clickAddProduct2() {buyProductsPage.clickAddProduct2();}

    @And("Click on: Toallas Higiénicas Ladysoft Básicas Sin Alas")
    public void clickAddProduct3() {buyProductsPage.clickAddProduct3();}

    @And("Click on: Shopping cart")
    public void clickBtnCart() {buyProductsPage.clickBtnCart();}

    @And("2 Click on: Plus button on Kotex ultra fine towels")
    public void clickBtnPlus1(){buyProductsPage.clickBtnPlus1();}

    @And("Click on: Empty cart")
    public void clickBtnEmptyCart() {buyProductsPage.clickBtnEmptyCart();}

    @And("Click on: Confirm empty cart")
    public void clickBtnConfirmEmpty() {
        buyProductsPage.clickBtnConfirmEmpty();}

}
