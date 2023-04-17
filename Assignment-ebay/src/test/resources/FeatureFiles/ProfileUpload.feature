Feature: Validate the profile functionality for e2eHiring application

  Background: Validate the profile functionality for e2eHiring application
    Given I launch the application
    When I enter emailid "abhilashhs14@gmail.com"
    When I enter password "Abhi@123"
    Then I click on login button
    Then I click on Me menu
    Then I click on view profile

     @profile @Basic
  Scenario: 1 Verification of Basic information functionality
    Then I enter First Name "Abhilash"
    Then I enter Last Name "Gowda"
    Then I enter headline "Proven experience as a QA tester|Knowledge and experience in automated testing tools, Selenium"
    Then I click on industry
    Then I select Accounting
    Then I select 2020 in Academic Completion Year dropdown
    Then I select Fresher in Candidate Type
    Then I enter Current City "Mysure"
    Then I select Joining immediately in Notice period dropdown
    And I click on save button
   
    @profile @Resume
    Scenario: 2 Verification of Resume upload functionality
     Then I clcik on Resume upload
     Then I click on update resume
     Then I select a path
     Then I click on submit button
     
     @profile @cover
      Scenario: 3 Verification of cover story functionality
      Then I click on Cover story
      Then I click on Upload/Create
      Then I click on enable Uploadvideo
      #Then I select  a cover story path
      #Then I click on Rightside submit button
      
      @profile @Links 
       Scenario: 4 Verification of Links story functionality
      Then I click on links
      Then I enter Github link "https://github.com/AbhiAbhilashGowda/e2eHiringTesting-repo.git"
      Then I enter Linkden link "https://www.linkedin.com/in/abhilash-gowda-080874144/"
      Then I click on Save links
      

  @profile @About
  Scenario: 5 Verification of About functionality
    Then I click on About
    Then I enter " QA testing"
    Then I click on save

  @profile @Skill
  Scenario: 6 Verification of Skills functionality
    Then I click on Skills
    Then I click on edit skills
    Then I enter skill one "java"
    Then I enter skill two "selenium"
    Then I enter skill three "manual"
    Then I click save button

  @profile @Education
  Scenario: 7 Verification of Education functionality
    Then I click on Education
    Then I click on add education
    Then I select school as VIT
    Then I enter degree as Science
    Then I select Specialization as Electronics and Communication Engineering
    Then I click passed year
    Then I select score  Type as cgpa
    Then I enter scored cgpa "6.8"
    Then I select medium as English
    Then I click on course type
    Then I clcik on save

  @profile @Jobpreference
  Scenario: 8 Verification of Job Preference functionality
    Then I click on Job preference
    Then I click Add on Looking for
    Then I click on FullTime in job preference
    Then I select work preference
    Then I select current salary in lacks
    Then I select current salary in thousand
    Then I select expected salary in lackhs "6 lacs"
    Then I select expected salary in thousand
    Then I click on save button in job preference

  @profile @Certification
  Scenario: 9 Verification of Certification functionality
    Then I click on Certifications
    Then I click on Add Certifications
    Then I enter certification name "Software Testing"
    Then I enter certifiedBy "Qspiders"
    Then I enter Link "https://www.qspiders.com/"
    Then I enter Issued on date "01/09/2023"
    Then I click on Valid date Lifetime in chekbox
    Then I click on not applicable in Grades checkbox
    Then I clcik on save button in Certifications

  @profile @Experience 
  Scenario: 10 Verification of Experience functionality
    Then I click on Work experience
    Then I click on Add Work experience
    Then I enter company name "Daitoz"
    Then I enter Industry as "Computer Software"
    Then I enter Destination as "QA Engineer"
    Then I enter workfrom date "02/14/2023"
    Then I enter salary as "4.20"
    Then I click on Save button in Experience

  @profile @Institute
  Scenario: 11 Verification of Training Institution functionality
    Then I click on Training institution
    Then I click on Add Training institution
    Then I enter Training name "Sowftware Testing"
    Then I enter institution name "Qspider(old airport road)"
    Then I enter start date "06/23/2022"
    Then I enter end date "02/09/2023"
    Then I enter Description "It`s a good training institution for software testing.we can learn manual testing, sql, java and selenium from good faculties."
    Then I click on save button in Training Institution

  @profile @Project
  Scenario: 12 Verification of Project functionality
    Then I click on Projects
    Then I click on Add Projects
    Then I enter Project name "Traffic Awareness scrolling LED board using IOT"
    Then I enter Role "Team lead"
    Then I select Duration in year
    Then I select Duration in month
    Then I enter Technology "IOT"
    Then I enter Project Description "This project is to create awareness on roads."
    Then I click on save button in projects

  @profile @Information
  Scenario: 13 Verification of Personal Information functionality
    Then I click on Personal Information
    Then I click on Add Personal Details
    Then I click on gender
    Then I enter Language1 "English"
    Then I enter Language2 "Kannada"
    Then I enter Pincode "571187"
    Then I click on save button in personal information
