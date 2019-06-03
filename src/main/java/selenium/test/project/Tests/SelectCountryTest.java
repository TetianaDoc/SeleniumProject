package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class SelectCountryTest extends AbstractTest {

    @Test
    public void successSelectCountry() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        profilePage.selectCountry();
        Assert.assertTrue(profilePage.isCountryDisplayed());
    }
}
