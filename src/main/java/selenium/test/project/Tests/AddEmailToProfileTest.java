package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

import java.util.Date;

public class AddEmailToProfileTest extends AbstractTest {
    @Test
    public void successAddEmailToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addEmail = profilePage.addEmail(
                new Date().getTime() + "_testingberize@gmail.com");
        profilePage = addEmail.submitProfileForms();
        Assert.assertTrue(profilePage.isEmailDisplayed());
    }
}
