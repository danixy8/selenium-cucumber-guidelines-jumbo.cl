package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.BaseDriverClass;

public class BuyProductsPage extends BaseDriverClass {

    @FindBy (xpath = "//input[contains(@class,'new-header-search-input')]")
    WebElement btnSearch;

    @FindBy(xpath = "//button[contains(@class,'new-header-search-submit')]")
    WebElement getBtnSearch;

    @FindBy(xpath = "(//button[@aria-label='Agregar'][contains(.,'Agregar')])[1]")
    WebElement btnAdd1;

    @FindBy(xpath = "(//button[contains(@aria-label,'Agregar')])[6]")
    WebElement btnAdd2;

    @FindBy(xpath = "(//button[@aria-label='Agregar'])[21]")
    WebElement btnAdd3;

    @FindBy(xpath = "//i[@class='jumbo-icon-shopping-cart']")
    WebElement btnAddCart;

    @FindBy(xpath = "(//button[contains(@class,'minicartcontent-quantity-btn jumbo-icon-plus ')])[1]")
    WebElement btnplus1;

    @FindBy(xpath = "//button[contains(.,'Vaciar carro')]")
    WebElement btnEmptyCart;

    @FindBy(xpath = "//button[contains(@class,'primary-btn modal-confirmation-delete-btn')]")
    WebElement btnConfirmEmpty;

    public BuyProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToWebpage(String url){redirectTo(url);}

    public void clickSearchBtn () {
        btnSearch.click();
    }

    public void writeOnSearch (String txtSearch){
        btnSearch.sendKeys(txtSearch);
        getBtnSearch.click();
    }

    public void clickAddProduct1 (){
        scrollToElement(btnAdd1);
        btnAdd1.click();
    }

    public void clickAddProduct2() {
        scrollToElement(btnAdd2);
        btnAdd2.click();
    }

    public void clickAddProduct3() {
        scrollToElement(btnAdd3);
        btnAdd3.click();

    }

    public void clickBtnCart(){
        btnAddCart.click();
    }

    public void clickBtnPlus1(){
        btnplus1.click();
        btnplus1.click();
    }

    public void clickBtnEmptyCart() {
        btnEmptyCart.click();
    }

    public void clickBtnConfirmEmpty(){
        btnConfirmEmpty.click();
    }


}
