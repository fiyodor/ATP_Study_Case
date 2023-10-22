package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "txtUserName")
    private WebElement emailOrPhoneBox;
    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"txtPassword\"]")
    private WebElement passwordBox;
    @FindBy(xpath = "//div[@class='hb-fzqCag zHkVE s4l15lzlgn2']")
    private WebElement passwordErrorText;
    @FindBy(xpath = "//div[@class='hb-fzqCag zHkVE s4l15lzlgn2']")
    private WebElement emailErrorText;


    public void sendEmail(String email) {
        emailOrPhoneBox.sendKeys(email);
    }
    public void clickOnSubmitButton(){
        submitButton.click();
    }
    public void sendPassword(String password){
        passwordBox.sendKeys(password);
    }
    public WebElement getPasswordErrorText() {
        return passwordErrorText;
    }
    public WebElement getEmailErrorText() {
        return emailErrorText;
    }
}
