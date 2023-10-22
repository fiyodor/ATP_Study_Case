package ATA.StepDefinitions;

import io.cucumber.java.en.When;

public class TC_08 extends BaseStep{

    @When("the user enters password as {string}")
    public void the_user_enters_password_as(String password){
        pages.loginPage.sendPassword(password);
    }
}
