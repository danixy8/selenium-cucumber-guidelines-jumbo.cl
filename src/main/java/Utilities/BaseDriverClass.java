package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriverClass {
	private static WebDriver driver;

    public BaseDriverClass(WebDriver driver) {
        BaseDriverClass.driver = driver;
    }

    protected void waitUntilElementVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }

    protected void redirectTo(String url){
        driver.get(url);
    }

    protected void scrollToElement(WebElement webElement){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }
}
