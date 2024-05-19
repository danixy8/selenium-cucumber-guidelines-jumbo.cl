package Managers;
import Enums.DriverType;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class AllDriverManager {

    private WebDriver webDriver;
    private static DriverType driverType;

    public AllDriverManager(DriverType driverType) {
        AllDriverManager.driverType = driverType;
    }

    private WebDriver createLocalDriver() {
        switch (driverType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.addArguments("--headless", "--window-size=1644,868", "--disable-notifications");
                chromeOptions.addArguments("--window-size=1644,868", "--disable-notifications");
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--window-size=1644,868", "--disable-notifications");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--window-size=1644,868", "--disable-notifications");
                webDriver = new EdgeDriver();
                break;
            case SAFARI:
                webDriver = new SafariDriver();
                break;
        }

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        webDriver.manage().deleteAllCookies();
        return webDriver;
    }


    public WebDriver getDriver() {
        if (webDriver == null) webDriver = createLocalDriver();
        return webDriver;
    }

}
