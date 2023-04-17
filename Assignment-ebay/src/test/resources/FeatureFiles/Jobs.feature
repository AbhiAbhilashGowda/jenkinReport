Feature: Validate the Jobs functionality for e2eHiring application

Background: Varify the Jobs functionality for e2eHiring application
           Given I launch the application
           When I enter emailid "abhilashhs14@gmail.com"
           When I enter password "Abhi@123"
           Then I click on login button
           Then I click on jobs

        @Jobss 
      Scenario: 1 Verification of Jobs functionality with valid credentials
  Then I select first job
  Then I click on copylink
        @Jobss @two
        Scenario: 2 Verification of slider functionality with valid credentials
  Then I drag experience to 0 to 2 years
  Then I fetch all Jobs
  Then I select jobType in checkbox
  Then I click on More in Locations
  Then I select places and click apply
  Then I select industries and click apply
