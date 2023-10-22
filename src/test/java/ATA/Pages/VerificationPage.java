package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerificationPage extends BasePage{
    @FindBy(xpath = "//label[contains(@class,'hb-fznKot bXTY siynd5psgip')]")
    private WebElement codeBox;
    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;


    public void sendCodeToCodeBox(String code) {
        codeBox.sendKeys(code);
    }
    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
