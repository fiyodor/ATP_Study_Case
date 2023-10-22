package ATA.StepDefinitions;

import io.cucumber.java.en.And;

public class TC_11 extends BaseStep{

    @And("the user adds a product to cart")
    public void the_user_adds_a_product_to_cart() {
        pages.afterLoginHomePage().clickOnAddToCartButton();

    }
    @And("the user clicks on cart item")
    public void the_user_clicks_on_cart_item() {
        pages.afterLoginHomePage().clickOnCartItem();
    }

    @And("the user clicks on Alışverişi Tamamla button")
    public void the_user_clicks_on_alışverişi_tamamla_button() {
        pages.cartPage().clickOnCompleteMyOrderButton();
    }
    @And("the user fills card number information as {string}")
    public void the_user_fills_card_number_information_as(String card) {
        pages.paymentPage().sendCardNumber(card);
    }
    @And("the user enters expire date as {string}")
    public void the_user_enters_expire_date_as(String string) {
        pages.paymentPage().sendDate(string);
    }
    @And("the user enters cvv as {string}")
    public void the_user_enter_cvv_as(String string) {
        pages.paymentPage().sendCvv(string);
    }
    @And("the user enters card holder name as {string}")
    public void the_user_enters_card_holder_name_as(String cardHolderName){
        pages.paymentPage().sendCardHolderName(cardHolderName);
    }
    @And("the user clicks on Siparişimi tamamla button")
    public void the_user_clicks_on_siparişimi_tamamla_button() {
        pages.paymentPage().clickOnConfirmMyOrderButton();
    }
    @And("the user clicks on Kart Bilgilerini Gir button")
    public void the_user_clicks_on_Kart_Bilgilerini_Gir_Button() {
        pages.paymentPage().clickOnEnterCardInfosButton();
    }
}
