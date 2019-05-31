package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div/nav/ul/li/span")
    private WebElement dashboardButton;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div/div")
    private WebElement dropdownMenuLink;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div/div/div[1]/div/div[2]/div[1]")
    private WebElement profileLinkButton;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div/div/div[1]/div/div[2]/div[2]")
    private WebElement exitButton;



    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDashboardButtonDisplayed() {
        return dashboardButton.isDisplayed();
    }

    //Go to Profile Page
    public ProfilePage goToProfilePage() {
        clickElement(dropdownMenuLink);
        clickElement(profileLinkButton);
        return new ProfilePage(driver);
    }

    //Logout
    public DashboardPage clickExitButton(){
        clickElement(dropdownMenuLink);
        clickElement(exitButton);
        return new DashboardPage(driver);
    }
}
