package ATA.StepDefinitions;

import io.cucumber.java.en.And;

public class TC_06 extends BaseStep{

    @And("the user clicks on Giriş yap button")
    public void theUserClicksOnGirisYapButton() {
        pages.homePage().clickOnLoginButton();
    }
}
