Feature: New User Registration

  Scenario: The user wants to register with an already registered phone number

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Üye ol button
    And the user enters email or phone number as "05432433090"
    And the user clicks on Devam Et button
    And the user enters code "123456"
    Then the user is redirected to login page