package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import ATA.Utilities.ConfigurationReader;
import ATA.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_01 extends BaseStep{
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open ::" + URL);
        BrowserUtils.wait(1);
    }
    @When("the user moves the cursor to the Giriş Yap veya üye ol text")
    public void the_user_moves_the_cursor_to_the_giriş_yap_veya_üye_ol_text() {
        pages.homePage().moveToRegisterOrLoginText();
    }

    @And("the user clicks on Üye ol button")
    public void the_user_clicks_on_üye_ol_button() {
        pages.homePage().clickOnRegisterButton();
    }

    @And("the user enters email or phone number as {string}")
    public void the_user_enters_email_or_phone_number_as(String info) {
        pages.registerPage().sendInfoToEmailOrPhoneBoxForRegister(info);
    }

    @And("the user clicks on Devam Et button")
    public void the_user_clicks_on_devam_et_button() {
        pages.registerPage().clickOnSubmitButton();
    }

    @And("the user enters code {string}")
    public void the_user_enters_code(String code) {
        pages.verificationPage().sendCodeToCodeBox(code);
    }

    @And("the user clicks on Üye ol button to complete registration")
    public void the_user_clicks_on_üye_ol_button_to_complete_registration() {
        pages.verificationPage().clickOnSubmitButton();
    }
    @And("the user enters name as {string} and surname as {string} to complete registration")
    public void the_user_enters_name_as_and_surname_as_to_complete_registration(String name, String surname) {
        pages.registerPage().sendNameToNameBox(name);
        pages.registerPage().sendSurnameToSurnameBox(surname);
    }
    @And("the user clicks on the consent checkbox")
    public void the_user_clicks_on_the_consent_checkbox(){
        pages.registerPage().clickOnConsentCheckBox();
    }
    @Then("the user logs out")
    public void the_user_logs_out() {
        pages.afterLoginHomePage().clickOnExitButton();
    }

}
