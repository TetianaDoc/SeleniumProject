package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

import java.util.Date;

public class AddPhoneNumberToProfileTest extends AbstractTest{
    @Test
    public void successAddPhoneNumberToProfileTest(){
        DashboardPage dashboardPage=new DashboardPage(driver);
        ProfilePage profilePage=dashboardPage.goToProfilePage();
        ProfilePage addPhoneNumber=profilePage.addPhoneNumber("67543268"+new Date().getTime());
        profilePage=addPhoneNumber.submitProfileForms();
        Assert.assertTrue(profilePage.isPhoneNumberDisplayed());
    }
}

