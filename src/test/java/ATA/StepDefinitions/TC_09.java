package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TC_09 extends BaseStep{
    @Then("the user sees password error")
    public void the_user_sees_password_error() {
        BrowserUtils.verifyElementDisplayed(pages.loginPage.getPasswordErrorText(), "Girdiğiniz şifre eksik veya hatalı.");
    }
}
