Feature: Payment

  Scenario: The user enters wrong car infos

    Given the user is on the homepage
    And the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Giriş yap button
    And the user enters email or phone number as "05432433090"
    And the user enters password as "Qwert.12345"
    And the user clicks on Giriş yap button
    And the user adds a product to cart
    And the user clicks on cart item
    And the user clicks on Alışverişi Tamamla button
    And the user clicks on Kart Bilgilerini Gir button
    And the user fills card number information as "123456789012345"
    And the user enters expire date as "3512"
    And the user enters cvv as "123"
    And the user enters card holder name as "Dönmez Ertuğrul"
    And the user clicks on Devam Et button
    And the user clicks on Alışverişi Tamamla button
    Then the user sees card infos wrong error
