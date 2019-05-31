package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.LoginPage;

public class LoginTest extends AbstractTest{


    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("testingberize@gmail.com", "testingberize");
        DashboardPage dashboardPage = loginPage.submitLoginForm();
        Assert.assertTrue(dashboardPage.isDashboardButtonDisplayed());
    }

}
