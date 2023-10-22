Feature: New User Registration Page

  Scenario:The user wants to register the page with wrong code

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Üye ol button
    And the user enters email or phone number as "05432433090"
    And the user clicks on Devam Et button
    And the user enters code "111111"
    Then the user sees code error on the page