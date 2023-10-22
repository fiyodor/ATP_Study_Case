package ATA.Pages;

import ATA.Utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@id='myAccount']")
    private WebElement registerOrLoginText;

    @FindBy(xpath = "//a[@id='register']")
    private WebElement registerButton;

    @FindBy(xpath = "//a[@id='login']")
    private WebElement loginButton;

    public void moveToRegisterOrLoginText() {
        BrowserUtils.moveToElement(registerOrLoginText);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

}
