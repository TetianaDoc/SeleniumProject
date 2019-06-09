package selenium.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public final class LoginPage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div/div[1]/div[1]/button")
    private WebElement languageButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/span/div/div")
    private WebElement divLanguages;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[2]")
    private WebElement englishLanguageDisplayed;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[1]/form/footer/button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }

    public LoginPage chooseEnLanguage() throws InterruptedException {
        clickElement(languageButton);
        WebElement en = driver
                .findElement(By.xpath("//*[contains(text(), 'EN')]"))
                .findElement(By.xpath(".."));
        Actions actions = new Actions(driver);
        actions.moveToElement(en).click().build().perform();
        return this;

    }

    public boolean isEnglishLanguageDisplayed() {
        return englishLanguageDisplayed.isDisplayed();
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
