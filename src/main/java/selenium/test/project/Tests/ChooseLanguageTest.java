package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.LoginPage;

public class ChooseLanguageTest extends AbstractTest {
    @Test
    public void successChooseLanguageTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.chooseEnLanguage();
        Assert.assertTrue(loginPage.isEnglishLanguageDisplayed());
    }
}
