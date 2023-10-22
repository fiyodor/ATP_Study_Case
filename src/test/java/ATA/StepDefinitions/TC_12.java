package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TC_12 extends BaseStep{
    @Then("the user sees card infos wrong error")
    public void the_user_sees_card_infos_wrong_error() {
        BrowserUtils.verifyElementDisplayed(pages.paymentPage().getCardInfosWrongText(), "Kart bilgileri eksik veya hatalı!");
    }
}
