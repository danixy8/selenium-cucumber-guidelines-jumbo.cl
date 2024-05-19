package StepDefinitions;

import java.util.UUID;

import Enums.DriverType;
import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static TestContext testContext;
    private WebDriver driver;

    @Before
    public void openBrowser() throws Exception {
        testContext = new TestContext(DriverType.CHROME);
        driver = testContext.getDriverManager().getDriver();
    }

    @AfterStep
    public void embedScreenshot(Scenario scenario) {
        try {
            String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshotName);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After
    public void quitBrowser(){
        driver.close();
    }

}
