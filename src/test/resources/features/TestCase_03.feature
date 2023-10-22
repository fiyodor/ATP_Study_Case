Feature: New User Registration Page

  Scenario: The user wants to register with email

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Üye ol button
    And the user enters email or phone number as "ertugrul.donmez32@gmail.com"
    And the user clicks on Devam Et button
    And the user verifies email
    And the user clicks on Üye ol button
    Then the user logs out