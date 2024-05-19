package Utilities;

import Enums.DriverType;
import Managers.AllDriverManager;
import Managers.PageObjectManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestContext {
    private final AllDriverManager driverManager;
    private final PageObjectManager pageObjectManager;

    public TestContext(DriverType driverType) {
        driverManager = new AllDriverManager(driverType);
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
    }

    public AllDriverManager getDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
