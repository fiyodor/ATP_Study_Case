package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
    @FindBy(id = "continue_step_btn")
    private WebElement confirmMyOrder;
    @FindBy(css = "input[name='cardNumber']")
    private WebElement cardNumberBox;
    @FindBy(css = "input[name='holderName']")
    private WebElement cardHolderNameBox;
    @FindBy(css = "input[name='expireDate']")
    private WebElement expireDateBox;
    @FindBy(css = "input[name='cvv']")
    private WebElement cvvBox;
    @FindBy(xpath = "//a[normalize-space()='Kart bilgilerini gir']")
    private WebElement enterCardInfosButton;
    @FindBy(xpath = "asd")
    private WebElement cardInfosWrongText;



    public void clickOnConfirmMyOrderButton(){
        confirmMyOrder.click();
    }
    public void sendCardNumber(String number){
        cardNumberBox.sendKeys(number);
    }
    public void sendCardHolderName(String name){
        cardHolderNameBox.sendKeys(name);
    }
    public void sendDate(String date){
        expireDateBox.sendKeys(date);
    }
    public void sendCvv(String cvv){cvvBox.sendKeys(cvv);}
    public void clickOnEnterCardInfosButton(){enterCardInfosButton.click();}
    public WebElement getCardInfosWrongText() {return cardInfosWrongText;}
}
