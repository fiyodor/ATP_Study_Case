Feature: New User Registration

  Scenario: The user wants to register the the site with a phone number

    Given the user is on the homepage
    When  the user moves the cursor to the Giriş Yap veya üye ol text
    And the user clicks on Üye ol button
    And the user enters email or phone number as "05432433090"
    And the user clicks on Devam Et button
    And the user enters code "123456"
    And the user clicks on Üye ol button to complete registration
    And the user enters name as "Ertuğrul" and surname as "Dönmez" to complete registration
    And the user clicks on the consent checkbox
    And the user clicks on Üye ol button
    Then the user logs out