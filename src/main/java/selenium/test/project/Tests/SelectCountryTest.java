package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.ProfilePage;

public class SelectCountryTest extends AbstractTest{

    @Test
    public void successSelectCountry(){
        ProfilePage profilePage=new ProfilePage(driver);
        profilePage.selectCountry();
        Assert.assertTrue(profilePage.isCountryDisplayed());
    }
}
