package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

import java.util.Date;

public class AddNameToProfileTest extends AbstractTest {
    @Test
    public void successAddNameToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage fillNameToProfileForms = profilePage.fillNameToProfileForms(
                "Tester_" + new Date().getTime());
        profilePage = fillNameToProfileForms.submitProfileForms();
        Assert.assertTrue(profilePage.isNameDisplayed());
    }
}

