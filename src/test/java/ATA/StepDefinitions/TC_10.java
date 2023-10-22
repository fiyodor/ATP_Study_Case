package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TC_10 extends BaseStep{
    @Then("the user sees email error")
    public void the_user_sees_email_error() {
        BrowserUtils.verifyElementDisplayed(pages.loginPage().getEmailErrorText(), "E-posta adresi eksik veya hatalı.");
    }
}
