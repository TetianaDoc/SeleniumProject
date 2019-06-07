package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class SelectLanguageTest extends AbstractTest {
    @Test
    public void successSelectLanguage() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage selectLanguage=profilePage.selectLanguage();
        profilePage=selectLanguage.submitProfileForms();
        Assert.assertTrue(profilePage.isLanguageDisplayed());
    }
}
