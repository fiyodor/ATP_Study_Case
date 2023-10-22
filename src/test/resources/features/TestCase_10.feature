Feature: Login Page

  Scenario: The user wants to login the website with incorrect email

    Given the user is on the homepage
    When the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Giriş yap button
    And the user enters email or phone number as "ert@gmail.com"
    Then the user sees email error