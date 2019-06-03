package selenium.test.project.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.test.project.Tests.Utils.CustomPath;
import selenium.test.project.Tests.Utils.CustomScreenshot;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;

    protected static CustomScreenshot customScreenshot;

    @BeforeSuite
    public void setUpSuite() {
        //Object Initialisation  customScreenShot
        customScreenshot = new CustomScreenshot();

        //Firefox driver file indication
        System.setProperty("webdriver.gecko.driver",
                new CustomPath().getResourcesPath("geckodriver.exe"));

        //Creation and Initialisation object DRIVER for Firefox browser
        driver = new FirefoxDriver();

        //Setup global timeout for 6 seconds
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        //Go to testing site
        driver.get("http://berize-dev.com");
    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            customScreenshot.makeScreenshot(
                    driver,
                    new Date().getTime() + "_" + result.getMethod().getMethodName()
            );
        }
    }

    //Shutdown of browser
    @AfterSuite
    public void tearDownSuite() {
        driver.quit();
    }
}
