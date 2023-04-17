package com.automation.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.LoginPage;
import com.automation.pages.ProfileUploadPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProfileUpload extends Base {

	ProfileUploadPage scenF = new ProfileUploadPage();
	LoginPage scenA = new LoginPage();

	@Then("^I click on Me menu$")
	public void i_click_on_me_menu() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonMe);

	}

	@Then("^I click on view profile$")
	public void i_click_on_view_profile() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectviewprofile);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);

	}

	@Then("^I enter First Name \"([^\"]*)\"$")
	public void i_enter_first_name_something(String fstname) throws Throwable {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.enterFirstname);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterFirstname, fstname);

	}

	@Then("^I enter Last Name \"([^\"]*)\"$")
	public void i_enter_last_name_something(String lstname) throws Throwable {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.enterLastname);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterLastname, lstname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	@Then("^I enter headline \"([^\"]*)\"$")
	public void i_enter_enter_headline_something(String headline) throws Throwable {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.clickonheadline);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.clickonheadline, headline);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);

	}

	@Then("^I click on industry$")
	public void i_click_on_industry() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectindustry);
	}

	@Then("^I select Accounting$")
	public void i_enter_something() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clcikonaccounting);

	}

	@Then("^I select 2020 in Academic Completion Year dropdown$")
	public void i_select_2020_in_academic_completion_year_dropdown() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectYear);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonyear);

	}

	@Then("^I select Fresher in Candidate Type$")
	public void i_select_Fresher_in_Candidate_Type() throws Exception {
		Thread.sleep(2000);
		WebElement element = Base.driver.findElement(By.xpath("//input[@value='fresher']"));
		JavascriptExecutor jse = (JavascriptExecutor) Base.driver;
		jse.executeScript("arguments[0].click();", element);

	}

	@Then("^I enter Current City \"([^\"]*)\"$")
	public void i_enter_current_city_something(String city) throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonCity);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.clickonCity, city);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.selectCity);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

	}

	@Then("^I select Joining immediately in Notice period dropdown$")
	public void i_select_joining_immediately_in_notice_period_dropdown() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.enterNoticeperiod);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.SelectNoticeperiod);
		Thread.sleep(2000);
	}

	@And("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clcikonSave);

	}

	@Then("^I clcik on Resume upload$")
	public void i_clcik_on_resume_upload() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonResumeUpload);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	@Then("^I click on update resume$")
	public void i_click_on_update_resume() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonUpdateResume);
		Thread.sleep(2000);
	}

	@Then("^I select a path$")
	public void i_select_a_path() throws Throwable {
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.id("inputFile"));
		Thread.sleep(2000);
		upload.sendKeys(
				"C:\\Users\\abhi\\OneDrive\\Desktop\\Task\\Assignment-ebay\\target\\copy.pdf.pdf");

	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		Thread.sleep(5000);
		Elements.click(ProfileUploadPage.ClickonSubmitButton);

	}

	@Then("^I click on Cover story$")
	public void i_click_on_cover_story() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonCoverStory);

	}

	@Then("^I click on Upload/Create$")
	public void i_click_on_uploadcreate() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonUploadorCreate);

	}

	@Then("^I click on enable Uploadvideo$")
	public void i_click_on_enable_uploadvideo() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonToggleButton);
		Thread.sleep(3000);
		// Elements.KeyboardEnter(ProfilePage.ClickonToggleButton);
	}

	@Then("^I select  a cover story path$")
	public void i_select_a_cover_story_path() throws Throwable {
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//img[@alt='upload']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.display='block';", element);
		driver.findElement(By.xpath("//img[@alt='upload']")).sendKeys(
				"C:\\Users\\abhi\\OneDrive\\Desktop\\CucumberFramework\\e2ehiring-candidate-test-automation-master\\target\\cucumber_html_report\\coverstory.mp4");
	}

	@Then("^I click on Rightside submit button$")
	public void i_click_on_rightside_submit_button() throws Throwable {
		Thread.sleep(5000);
		Elements.click(ProfileUploadPage.ClickonSubminCoverStory);

	}
	 @Then("^I click on links$")
	    public void i_click_on_links() throws Throwable {
		 Thread.sleep(2000);
		 Elements.click(ProfileUploadPage.ClickonLinks);
	        
	    }

	    @Then("^I enter Github link \"([^\"]*)\"$")
	    public void i_enter_github_link_something(String link1) throws Throwable {
	    	Thread.sleep(2000);
	    	Elements.TypeText(ProfileUploadPage.EnterGithubLink, link1);
	        
	    }

	    @Then("^I enter Linkden link \"([^\"]*)\"$")
	    public void i_enter_linkden_link_something(String link2) throws Throwable {
	    	Thread.sleep(2000);
	    	Elements.TypeText(ProfileUploadPage.EnterLinkdenLink, link2);
	    	Thread.sleep(2000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
	        
	    }

	    @Then("^I click on Save links$")
	    public void i_click_on_save_links() throws Throwable {
	    	Elements.click(ProfileUploadPage.ClickSaveLinks);
	    }
	@Then("^I click on About$")
	public void i_click_on_about() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonAbout);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

	}

	@Then("^I enter \"([^\"]*)\"$")
	public void i_enter_something(String about) throws Throwable {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.enterAbout);
		Elements.TypeText(ProfileUploadPage.enterAbout, about);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

	}

	@Then("^I click on save$")
	public void i_click_on_save() throws Throwable {
		Elements.click(ProfileUploadPage.clickabtsave);

	}

	@Then("^I click on Skills$")
	public void i_click_on_skills() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonskills);

	}

	@Then("^I click on edit skills$")
	public void i_click_on_edit_skills() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickoneditskill);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.EnterSkill);
		Thread.sleep(2000);
		
	}
	@Then("^I enter skill one \"([^\"]*)\"$")
	public void i_enter_skill_one(String skill) throws Throwable {

	}

	@Then("^I enter skill two \"([^\"]*)\"$")
	public void i_enter_skill_two(String skilltwo) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterSkill,skilltwo);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.EnterSkill);
	   	}

	@Then("^I enter skill three \"([^\"]*)\"$")
	public void i_enter_skill_three(String skillthree) throws Throwable {
		Thread.sleep(2000);
	Elements.TypeText(ProfileUploadPage.EnterSkill, skillthree);
	Thread.sleep(2000);
	Elements.KeyboardEnter(ProfileUploadPage.EnterSkill);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(2000);
	}

	@Then("^I click save button$")
	public void i_click_save_button() throws Throwable {
		Elements.click(ProfileUploadPage.clickonskillSave);
		Thread.sleep(3000);

	}

	@Then("^I click on Education$")
	public void i_click_on_Education() throws Exception {
		Elements.click(ProfileUploadPage.clickonEducation);
		Thread.sleep(4000);

	}

	@Then("^I click on add education$")
	public void i_click_on_add_education() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonAddeducation);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	@Then("^I select school as VIT$")
	public void i_select_school_as_VIT() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonSchool);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonvit);
		Thread.sleep(2000);
	}

	@Then("^I enter degree as Science$")
	public void i_enter_degree_as_science() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.enterdegreetype);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectScience);
		Thread.sleep(2000);
		// Elements.click(ProfilePage.enterdegreetype);
	}

	@Then("^I select Specialization as Electronics and Communication Engineering$")
	public void i_select_specialization_as_electronics_and_communication_engineering() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickspecialization);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectspecialization);
	}

	@Then("^I click passed year$")
	public void i_click_passed_year() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonpassingyear);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectpassingyear);

	}

	@Then("^I select score  Type as cgpa$")
	public void i_select_score_type_as_cgpa() throws Throwable {
		Elements.click(ProfileUploadPage.clickonscore);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectcgpa);

	}

	@Then("^I enter scored cgpa \"([^\"]*)\"$")
	public void i_enter_scored_cgpa_something(String score) throws Throwable {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.enterYOurScore);
		Elements.TypeText(ProfileUploadPage.enterYOurScore, score);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);

	}

	@Then("^I select medium as English$")
	public void i_select_medium_as_english() throws Throwable {
		Elements.click(ProfileUploadPage.clickonMedium);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectEnglish);
	}

	@Then("^I click on course type$")
	public void i_click_on_course_type() throws Throwable {
		Thread.sleep(2000);

		WebElement element = Base.driver
				.findElement(By.xpath("(//div[@class='MuiFormGroup-root MuiFormGroup-row']//input)[1]"));
		JavascriptExecutor jse = (JavascriptExecutor) Base.driver;
		jse.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
	}

	@Then("^I clcik on save$")
	public void i_clcik_on_save() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickoneducationSave);

	}

	@Then("^I click on Job preference$")
	public void i_click_on_Job_preference() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonJobpreference);

	}

	@Then("^I click Add on Looking for$")
	public void i_click_Add_on_Looking_for() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonAddinJobpreference);

	}

	@Then("^I click on FullTime in job preference$")
	public void i_click_on_FullTime_in_job_preference() throws Exception {
		Thread.sleep(2000);
		WebElement element = Base.driver.findElement(By.xpath("//input[@value='Full Time']"));
		JavascriptExecutor jse = (JavascriptExecutor) Base.driver;
		jse.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);

	}

	@Then("^I select work preference$")
	public void i_select_work_preference() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

	}

	@Then("^I select current salary in lacks$")
	public void i_select_current_salary_in_lacks() throws Exception {
		Elements.click(ProfileUploadPage.clickoncurretsalary);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectsalaryinlack);

	}

	@Then("^I select current salary in thousand$")
	public void i_select_current_salary_in_thousand() throws Exception {
		Elements.click(ProfileUploadPage.clickontsalryinthousand);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectsalryinthousand);

	}

	@Then("^I select expected salary in lackhs \"([^\"]*)\"$")
	public void i_select_expected_salary_in_lackhs_something(String selectExpectedSalary) throws Throwable {
		Elements.click(ProfileUploadPage.clickExpectedSalaryDropdown);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("(//div[@class='ant-select-item-option-content'][normalize-space()='6 Lacs'])[2]"));
		Thread.sleep(1000);
		act.moveToElement(element).click().perform();
		Thread.sleep(2000);

	}

	@Then("^I select expected salary in thousand$")
	public void i_select_expected_salary_in_thousand() throws Exception {
		
		Elements.click(ProfileUploadPage.clickExpectedSalaryinThousand);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.selectExpectedSalaryinThousand);

	}

	@Then("^I click on save button in job preference$")
	public void i_click_on_save_button_in_job_preference() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clicksaveinJobpreference);

	}

	@Then("^I click on Certifications$")
	public void i_click_on_Certifications() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonCertification);

	}

	@Then("^I click on Add Certifications$")
	public void i_click_on_Add_Certifications() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonAddCertification);
		Thread.sleep(2000);

	}

	@Then("^I enter certification name \"([^\"]*)\"$")
	public void i_enter_certification_name(String name) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterCertificationName, name);
	}

	@Then("^I enter certifiedBy \"([^\"]*)\"$")
	public void i_enter_certifiedBy(String certified) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterCertifiedBy, certified);

	}

	@Then("^I enter Link \"([^\"]*)\"$")
	public void i_enter_Link(String link) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterLink, link);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
	}

	@Then("^I enter Issued on date \"([^\"]*)\"$")
	public void i_enter_Issued_on_date(String date) throws Exception {
		// Elements.click(ProfilePage.clickIssuedDate);
		// Thread.sleep(3000);
		Elements.TypeText(ProfileUploadPage.enterIssuedDate, date);
		Thread.sleep(3000);
		Elements.KeyboardEnter(ProfileUploadPage.enterIssuedDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);

	}

	@Then("^I click on Valid date Lifetime in chekbox$")
	public void i_click_on_Valid_date_Lifetime_in_chekbox() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[6]//div[2]//div[1]//div[1]//input[1]")).click();

	}

	@Then("^I click on not applicable in Grades checkbox$")
	public void i_click_on_not_applicable_in_Grades_checkbox() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@name,'gradesvalid')])[2]")).click();

	}

	@Then("^I clcik on save button in Certifications$")
	public void i_clcik_on_save_button_in_Certifications() throws Exception {
		Elements.click(ProfileUploadPage.clickonSaveinCertification);

	}

	@Then("^I click on Work experience$")
	public void i_click_on_Work_experience() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonWorkExperience);
	}

	@Then("^I click on Add Work experience$")
	public void i_click_on_Add_Work_experience() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonAddWorkExperience);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	@Then("^I enter company name \"([^\"]*)\"$")
	public void i_enter_company_name(String company) throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.enterCompanyName);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterCompanyName, company);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.enterCompanyName);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement element = Base.driver.findElement(By.xpath("//input[@value='true']"));
		JavascriptExecutor jse = (JavascriptExecutor) Base.driver;
		jse.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);

	}

	@Then("^I enter Industry as \"([^\"]*)\"$")
	public void i_enter_Industry_as(String industry) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterIndustryType, industry);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.enterIndustryType);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("^I enter Destination as \"([^\"]*)\"$")
	public void i_enter_Destination_as(String designation) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterDesignstion, designation);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.enterDesignstion);

	}

	@Then("^I enter workfrom date \"([^\"]*)\"$")
	public void i_enter_workfrom_date(String fromdate) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterWorkFromDate, fromdate);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.enterWorkFromDate);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("^I enter salary as \"([^\"]*)\"$")
	public void i_enter_salary_as(String salary) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.enterLPA, salary);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("^I click on Save button in Experience$")
	public void i_click_on_Save_button_in_Experience() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.clickonSaveinWorkExperience);

	}

	@Then("^I click on Training institution$")
	public void i_click_on_Training_institution() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonTrainingInstitution);
	}

	@Then("^I click on Add Training institution$")
	public void i_click_on_Add_Training_institution() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonAddInstitution);

	}

	@Then("^I enter Training name \"([^\"]*)\"$")
	public void i_enter_Training_name(String name) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterTrainingName, name);

	}

	@Then("^I enter institution name \"([^\"]*)\"$")
	public void i_enter_institution_name(String institute) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterInstituteName, institute);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.EnterInstituteName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");

	}

	@Then("^I enter start date \"([^\"]*)\"$")
	public void i_enter_start_date(String date) throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonStartDate);

		Elements.TypeText(ProfileUploadPage.ClickonStartDate, date);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.ClickonStartDate);
		Thread.sleep(2000);

	}

	@Then("^I enter end date \"([^\"]*)\"$")
	public void i_enter_end_date(String enddate) throws Exception {
		Elements.click(ProfileUploadPage.ClickonEndDate);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.ClickonEndDate, enddate);
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.ClickonEndDate);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");

	}

	@Then("^I enter Description \"([^\"]*)\"$")
	public void i_enter_Description(String about) throws Exception {
		Elements.click(ProfileUploadPage.EnterDescription);
		Elements.clearTxtBox(ProfileUploadPage.EnterDescription);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterDescription, about);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");

	}

	@Then("^I click on save button in Training Institution$")
	public void i_click_on_save_button_in_Training_Institution() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonSaveInInstitute);

	}

	@Then("^I click on Projects$")
	public void i_click_on_Projects() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonProjects);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	@Then("^I click on Add Projects$")
	public void i_click_on_Add_Projects() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonAddProjects);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");


	}

	@Then("^I enter Project name \"([^\"]*)\"$")
	public void i_enter_Project_name(String name) throws Exception {
		Elements.clearTxtBox(ProfileUploadPage.EnterProjectName);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterProjectName, name);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

	}

	@Then("^I enter Role \"([^\"]*)\"$")
	public void i_enter_Role(String role) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterRole, role);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

	}

	@Then("^I select Duration in year$")
	public void i_select_Duration_in_year() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickProjectDurationYear);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.SelectProjectDurationYear);

	}

	@Then("^I select Duration in month$")
	public void i_select_Duration_in_month() throws Exception {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickProjcetDurationMonth);
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.SelectProjcetDurationMonth);
	}

	@Then("^I enter Technology \"([^\"]*)\"$")
	public void i_enter_Technology(String technology) throws Exception {
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterTechnology, technology);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	@Then("^I enter Project Description \"([^\"]*)\"$")
	public void i_enter_Project_Description(String description) throws Exception {
		Thread.sleep(2000);
		Elements.clearTxtBox(ProfileUploadPage.EnterProjectDescription);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterProjectDescription, description);
		Thread.sleep(2000);
	}

	@Then("^I click on save button in projects$")
	public void i_click_on_save_button_in_projects() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickSaveinProjects);

	}

	@Then("^I click on Personal Information$")
	public void i_click_on_personal_information() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonPersonalInformation);
	}

	@Then("^I click on Add Personal Details$")
	public void i_click_on_add_personal_details() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonAddPersonalInformation);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	@Then("^I click on gender$")
	public void i_click_on_gender() throws Throwable {
		Thread.sleep(2000);
		WebElement element = Base.driver.findElement(By.xpath("//input[@value='MALE']"));
		JavascriptExecutor jse = (JavascriptExecutor) Base.driver;
		jse.executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
        Elements.click(ProfileUploadPage.ClickonLanguages);
	}

	@Then("^I enter Language1 \"([^\"]*)\"$")
	public void i_enter_language1_something(String one) throws Throwable {
		Thread.sleep(2000);
		//Elements.click(ProfileUploadPage.ClickonLanguages);
		//Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='ant-select-selection-overflow']"));
		Actions action = new Actions(driver);
		action.sendKeys(element, "English").build().perform();
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.SelectLanguage1);
		Thread.sleep(2000);

	}

	@Then("^I enter Language2 \"([^\"]*)\"$")
	public void i_enter_language2_something(String two) throws Throwable {
		WebElement element2 = driver.findElement(By.xpath("(//input[@id='rc_select_0'])[1]"));
		Actions action = new Actions(driver);
		action.sendKeys(element2, "Kannada").build().perform();
		Thread.sleep(2000);
		Elements.KeyboardEnter(ProfileUploadPage.SelectLanguage2);
		Thread.sleep(2000);

	}

	@Then("^I enter Pincode \"([^\"]*)\"$")
	public void i_enter_pincode_something(String pincode) throws Throwable {
		Elements.clearTxtBox(ProfileUploadPage.EnterPincode);
		Thread.sleep(2000);
		Elements.TypeText(ProfileUploadPage.EnterPincode, pincode);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(5000);

	}

	@Then("^I click on save button in personal information$")
	public void i_click_on_save_button_in_personal_information() throws Throwable {
		Thread.sleep(2000);
		Elements.click(ProfileUploadPage.ClickonSaveinPersonalInforamtion);

	}

}