package ATA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginHomePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"DealOfTheDay_6ba21cad-c6cc-4143-f0b3-3461307e6298\"]/div/div/div[2]/div/div/div/div/div[2]/div/div/a/div[2]")
    private WebElement addToCartButton;

    @FindBy(css = "a[href='https://checkout.hepsiburada.com/sepetim']")
    private WebElement cartItem;

    @FindBy(xpath = "//a[contains(text(),'Çıkış Yap')]")
    private WebElement exitButton;

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnCartItem() {
        cartItem.click();
    }

    public void clickOnExitButton() {
        exitButton.click();
    }
}
