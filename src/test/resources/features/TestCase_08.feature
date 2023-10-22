Feature: Login Page

  Scenario: The user wants to login the website with correct email and password

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Giriş yap button
    And the user enters email or phone number as "ertugrul.donmez32@gmail.com"
    And the user clicks on Giriş yap button
    And the user enters password as "Qwert.12345"
    And the user clicks on Giriş yap button
    Then the user logs out