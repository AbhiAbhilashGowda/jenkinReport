Feature: Validate the Register functionality for e2eHiring application

        @register 
      Scenario: 1 Verification of Register functionality 
Given I launch application
Then I click on Register
Then I enter first name 
Then I enter last name 
Then I open new TAB enter URl  
Then I enter New emailid
Then I enter New password "Abhi@123"
Then I click on Register button

@delete
    Scenario: 2 Verification of delete Account functionality 
Given I launch application
Then I enter registered emailid
Then I enter registered password "Abhi@123"
Then I click on me
Then I  click on settings and privacy
Then I click on delete account permentaly
Then I click on confirm delete
Then I enter otp
Then I click on delete account