package selenium.test.project.Tests;

import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;

public class LogoutTest extends AbstractTest {
    @Test
    public void successLogoutTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickExitButton();
    }
}
