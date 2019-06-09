package selenium.test.project.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {

    //Line to add Name info
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div/input")
    private WebElement nameField;

    //Line to add Last Name info
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[3]/div/input")
    private WebElement lastNameField;

    //Name field for confirmation
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div[1]")
    private WebElement infoName;

    //Last Name field for confirmation
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[3]/div/div[1]")
    private WebElement infoLastName;

    //Field for selection country
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[4]/div[1]/div/div[2]/div[1]/div/div[1]")
    private WebElement selectCountry;

    //Country button
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div[2]/div[2]/div/span")
    private WebElement countryButton;

    //Country Info is displayed
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div[2]/div/div/div[1]")
    private WebElement countryInfo;

    //Field for selection language
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div[2]")
    private WebElement selectLanguage;

    //Select Language button
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[1]/div[5]/div/div[2]/div[2]/div[2]")
    private WebElement languageButton;

    //Language info is displayed
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[1]/div[5]/div/div[2]/div/div/div[1]")
    private WebElement languageInfo;

    //Line to add Email info
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/input")
    private WebElement emailField;

    //Email field for confirmation
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/input")
    private WebElement infoEmail;

    //Line to add Phone number
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div/input")
    private WebElement phoneNumberField;

    //Phone number field for confirmation
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div/input")
    private WebElement infoPhoneNumber;

    //Confirmed button for clicking to save profile information
    @FindBy(xpath = "/html/body/div[1]/div/main/div/div/div[1]/div/div[2]/div[2]/div[2]/button/div/span")
    private WebElement confirmedButton;


    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    //Add Name to Profile
    public ProfilePage fillNameToProfileForms(String name) {
        fillField(nameField, name);
        return this;
    }

    public boolean isNameDisplayed() {
        return infoName.isDisplayed();
    }

    //Add Last Name to Profile
    public ProfilePage fillLastNameToProfileForms(String lastname) {
        fillField(lastNameField, lastname);
        return this;
    }

    public boolean isLastNameDisplayed() {
        return infoLastName.isDisplayed();
    }

    //Select Country
    public ProfilePage selectCountry() {
        clickElement(selectCountry);
        clickElement(countryButton);
        return this;
    }

    public boolean isCountryDisplayed() {
        return countryInfo.isDisplayed();
    }

    //Select Language
    public ProfilePage selectLanguage() {
        clickElement(selectLanguage);
        clickElement(languageButton);
        return this;
    }

    public boolean isLanguageDisplayed() {
        return languageInfo.isDisplayed();
    }

    //Add Email
    public ProfilePage addEmail(String email) {
        fillField(emailField, email);
        return this;
    }

    public boolean isEmailDisplayed() {
        return infoEmail.isDisplayed();
    }

    //Add Phone Number
    public ProfilePage addPhoneNumber(String phone_number) {
        fillField(phoneNumberField, phone_number);
        return this;
    }

    public boolean isPhoneNumberDisplayed() {
        return infoPhoneNumber.isDisplayed();
    }

    //Click Confirm button to save info to Profile
    public ProfilePage submitProfileForms() {

        try {
            clickElement(confirmedButton);
            return new ProfilePage(driver);
        } catch (NoSuchElementException e) {
            return this;
        }
    }
}
