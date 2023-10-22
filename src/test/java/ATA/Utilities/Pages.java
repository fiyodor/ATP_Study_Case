package ATA.Utilities;

import ATA.Pages.*;

public class Pages {
    private HomePage homePage;
    private RegistrationPage registerPage;
    public LoginPage loginPage;
    private VerificationPage verificationPage;
    private AfterLoginHomePage afterLoginHomePage;
    private CartPage cartPage;
    private PaymentPage paymentPage;

    public Pages() {
        this.homePage = new HomePage();
        this.registerPage = new RegistrationPage();
        this.loginPage = new LoginPage();
        this.verificationPage = new VerificationPage();
        this.afterLoginHomePage = new AfterLoginHomePage();
        this.cartPage = new CartPage();
        this.paymentPage = new PaymentPage();
    }


    public HomePage homePage() {
        return homePage;
    }
    public AfterLoginHomePage afterLoginHomePage() {
        return afterLoginHomePage;
    }
    public RegistrationPage registerPage() {return registerPage;}
    public LoginPage loginPage() {
        return loginPage;
    }
    public VerificationPage verificationPage() {
        return verificationPage;
    }
    public CartPage cartPage() {
        return cartPage;
    }
    public PaymentPage paymentPage() {
        return paymentPage;
    }
}
