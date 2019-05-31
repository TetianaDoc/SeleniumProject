package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

import java.util.Date;

public class AddLastNameToProfileTest extends AbstractTest {
    @Test
    public void successAddLastNameToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage fillLastNameToProfileForms = profilePage.fillLastNameToProfileForms(
                "Good_" + new Date().getTime());
        profilePage = fillLastNameToProfileForms.submitProfileForms();
        Assert.assertTrue(profilePage.isLastNameDisplayed());
    }
}
