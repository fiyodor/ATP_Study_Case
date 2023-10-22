package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(xpath = "//input[@id='txtUserName']")
    WebElement emailOrPhoneNumberBox;
    @FindBy(css = "button[type='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"txtName\"]")
    WebElement nameBox;
    @FindBy(xpath = "//*[@id=\"txtSurname\"]")
    WebElement surnameBox;
    @FindBy(xpath = "//*[@id=\"checkConsentText\"]")
    WebElement consentTextCheckBox;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/h1/div")
    private WebElement hosGeldinizText;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[2]")
    private WebElement codeErrorText;

    @FindBy(xpath = "//div[@class='hb-fznKot EwkzZ s3dwyy0z4qh']")
    private WebElement emailExistsErrorText;


    public WebElement getHosGeldinizText() {
        return hosGeldinizText;
    }
    public void sendInfoToEmailOrPhoneBoxForRegister(String str) {
        emailOrPhoneNumberBox.sendKeys(str);
    }
    public void sendNameToNameBox(String name) {
        nameBox.sendKeys(name);
    }
    public void sendSurnameToSurnameBox(String surname) {
        nameBox.sendKeys(surname);
    }
    public void clickOnConsentCheckBox() {
        consentTextCheckBox.click();
    }
    public void clickOnSubmitButton() {
        submitButton.click();
    }
    public WebElement getCodeError() {
        return codeErrorText;
    }
    public WebElement getEmailExistsErrorText(){
        return emailExistsErrorText;
    }

}