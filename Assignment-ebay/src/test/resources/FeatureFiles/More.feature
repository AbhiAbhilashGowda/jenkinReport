   Feature: Validate the More functionality for e2eHiring application
  
   Background: Verification of More functionality
   Given I launch the application
   When I enter emailid "abhilashhs14@gmail.com"
   When I enter password "Abhi@123"
   Then I click on login button
   Then I click on More menu
   @More @Jobfair
      Scenario: 1 Verification of Jobfair functionality 
  Then I click on job fair
  Then I click on ongoing
  Then I click on completed

   @More @Bootcamp
     Scenario: 2 Verification of Bootcamp functionality
  Then I click on Bootcamp
  Then I click on First option
  
   @More @partners
    Scenario: 3 Verification of Partners functionality
  Then I click on partners
  Then I click on All companies
  Then I click on All colleges
  Then I click on All Institutes
  
   @More @Blogs
    Scenario: 4 Verification of Blogs functionality
  Then I click on Blogs
  Then I click on my blogs
  
   @More @Newsroom
 Scenario: 5 Verification of newsroom functionality
  Then I click on newsroom
  
    @More @Team
 Scenario: 6 Verification of Team functionality
  Then I click on Team
  Then I click on FirstTeam
    
      @More @FAQs
 Scenario: 7 Verification of FAQs functionality
  Then I click on FAQs
  Then I click on How to apply jobs
  
   @More @Testimonials
 Scenario: 8 Verification of Testimonials functionality
  Then I click on Testimonials
  Then I click on Recrutiters
  Then I click on Candidates
  
   @More @Campus
 Scenario: 9 Verification of Campus functionality
  Then I click on Campus
  
  