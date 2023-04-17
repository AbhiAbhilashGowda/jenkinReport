Feature: Validate the courses functionality for e2eHiring application

        @Courses @one
      Scenario: Verification of Courses functionality with valid credentials
Given I launch the application
When I enter emailid "abhilashhs14@gmail.com"
When I enter password "Abhi@123"
Then I click on login button
Then I click on Courses menu
Then I click on First courses
Then I click on share Through Whatsup