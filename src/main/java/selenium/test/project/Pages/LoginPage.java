package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class LoginPage extends AbstractPage {
    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[1]/form/footer/button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillLoginForm(String email, String password) {
        fillField(emailField, email);
        fillField(passwordField, password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        clickElement(loginButton);
        return new DashboardPage(driver);
    }
}
