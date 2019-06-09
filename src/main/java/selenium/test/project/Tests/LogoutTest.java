package selenium.test.project.Tests;

import junit.framework.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.LoginPage;

public class LogoutTest extends AbstractTest {
    @Test
    public void successLogoutTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickExitButton();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLoginButtonDisplayed());
    }
}
