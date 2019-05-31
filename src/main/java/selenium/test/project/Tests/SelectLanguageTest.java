package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.ProfilePage;

public class SelectLanguageTest extends AbstractTest {
    @Test
    public void successSelectLanguage() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.selectLanguage();
        Assert.assertTrue(profilePage.isLanguageDisplayed());
    }
}
