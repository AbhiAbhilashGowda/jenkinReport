Feature: Validate the Mentorshipp functionality for e2eHiring application

        @Jobss @one
      Scenario: Verification of mentorship functionality with valid credentials
Given I launch the application
When I enter emailid "abhilashhs14@gmail.com"
When I enter password "Abhi@123"
Then I click on login button
Then I click on mentorship
Then I click on overview
Then I click on Register for orientation