package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TC_02 extends BaseStep{

    @Then("the user is redirected to login page")
    public void the_user_is_redirected_to_login_page(){
        BrowserUtils.verifyElementDisplayed(pages.registerPage().getHosGeldinizText(), "Hoş Geldiniz");
    }
}
