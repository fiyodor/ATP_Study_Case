package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(id = "continue_step_btn")
    private WebElement completeMyOrderButton;
    public void clickOnCompleteMyOrderButton(){
        completeMyOrderButton.click();
    }
}
