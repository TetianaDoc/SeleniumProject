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

        customScreenshot = new CustomScreenshot();

        System.setProperty("webdriver.gecko.driver",
                new CustomPath().getResourcesPath("geckodriver.exe"));
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        //      driver.manage().window().maximize();
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

    @AfterSuite
    public void tearDownSuite() {
        driver.quit();
    }
}
