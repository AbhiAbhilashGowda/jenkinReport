Feature: Validate the login functionality for e2eHiring with invalid Credencials 

        @login @one
      Scenario: Verification of login functionality with invalid emailid and invalid passwpord credentials
Given I launch the application
When I enter invalid emailid "abhilashhgmail.com"
When I enter invalid password "Diatoz"
Then I click on login button
Then I should get error message
@Login @two
     Scenario: Verification of login functionality with valid emailid and invalid passwpord credentials
  Given I launch the application
When I enter valid emailid "abhilashhs14@gmail.com"
When I enter invalid password "1234567"
Then I click on login button
Then I should get error message 
@login @Three


 Scenario: Verification of login functionality with invalid emailid and valid passwpord credentials
  Given I launch the application
When I enter invalid emailid "abhilashhgmail.com"
When I enter valid password "Abhi@123"
Then I click on login button
Then I should get error message 

