Feature: New User Registration Page

  Scenario: The user wants to register the page with an already registered email

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Üye ol button
    And the user enters email or phone number as "ertugrul.donmez32@gmail.com"
    And the user clicks on Devam Et button
    Then the user sees email exists error on the page