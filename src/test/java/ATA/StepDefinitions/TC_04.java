package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TC_04 extends BaseStep{

   @Then("the user sees code error on the page")
    public void the_user_sees_code_error_on_the_page(){
       BrowserUtils.verifyElementDisplayed(pages.registerPage().getCodeError(), "Doğrulama kodu hatalı");
    }
    @Then("the user sees email exists error on the page")
    public void the_user_sees_email_exists_error_on_the_page(){
       BrowserUtils.verifyElementDisplayed(pages.registerPage().getEmailExistsErrorText(), "Bu e-posta adresine ait bir hesabınız olduğunu fark ettik.");
    }

}
