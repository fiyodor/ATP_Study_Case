Feature: Login Page

  Scenario: The user wants to login the website with correct phone number

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Giriş yap button
    And the user enters email or phone number as "05432433090"
    And the user clicks on Giriş yap button
    And the user enters code "123123"
    Then the user logs out