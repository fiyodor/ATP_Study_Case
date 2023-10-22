package ATA.StepDefinitions;

import io.cucumber.java.en.And;

public class TC_03 extends BaseStep{

    @And("the user verifies email")
    public void verifyEmail(){
        System.out.println("Email verified successfully. Please continue on the browser");
    }

}
