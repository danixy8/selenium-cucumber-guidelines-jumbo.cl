package Managers;
import PageObjects.BuyProductsPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectManager {
    private final WebDriver webDriver;
    private BuyProductsPage buyProductsPage;
    private HomePage homePage;
    private LoginPage loginPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public BuyProductsPage getBuyProductsPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        return (buyProductsPage == null) ? buyProductsPage = new BuyProductsPage(webDriver) : buyProductsPage;
    }

    public HomePage getHomePage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public LoginPage getLoginPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        return (loginPage == null) ? loginPage = new LoginPage(webDriver) : loginPage;
    }

}
