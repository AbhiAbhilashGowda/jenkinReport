
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class ProfileUploadPage {

	public ProfileUploadPage() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public static WebElement enterusername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement enterpassword;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
	public static WebElement clickLogin;

	@FindBy(xpath = "//div[@class='desktop-navbar d-flex align-items-center']//img[@alt='avtar']")
	public static WebElement clickonMe;

	@FindBy(xpath = "(//button[@class='user-contact-details-button-navbar'][normalize-space()='View Profile'])[1]")
	public static WebElement selectviewprofile;

//@FindBy(xpath = "//div[@class='d-md-block d-none']//img[@id='editIcon']")
//public static WebElement clickonEditButton;

	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
	public static WebElement enterFirstname;

	@FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
	public static WebElement enterLastname;

	@FindBy(xpath = "//input[@id='headline']")
	public static WebElement clickonheadline;

	@FindBy(xpath = "(//*[name()='svg'][@class='css-8mmkcg'])[2]")
	public static WebElement selectindustry;

	@FindBy(xpath = "(//div[@id='react-select-2-option-0'])[1]")
	public static WebElement clcikonaccounting;

	@FindBy(xpath = "//div[@class='ant-picker-input']")
	public static WebElement selectYear;

	@FindBy(xpath = "//div[normalize-space()='2020']")
	public static WebElement clickonyear;

	@FindBy(xpath = "//input[@value='fresher']")
	public static WebElement selectASFresher;

	@FindBy(xpath = "(//input[@id='react-select-3-input'])[1]")
	public static WebElement clickonCity;

	@FindBy(xpath = "(//div[@id='react-select-3-option-0'])[1]")
	public static WebElement selectCity;

	@FindBy(xpath = "//input[@id='auto-highlight']")
	public static WebElement enterNoticeperiod;

	@FindBy(xpath = "(//li[@id='auto-highlight-option-0'])[1]")
	public static WebElement SelectNoticeperiod;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clcikonSave;

	@FindBy(xpath = "//button[normalize-space()='About']")
	public static WebElement clickonAbout;

	@FindBy(xpath = "//textarea[@class='ant-input']")
	public static WebElement enterAbout;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clickabtsave;

	@FindBy(xpath = "//button[normalize-space()='Skills']")
	public static WebElement clickonskills;

	@FindBy(xpath = "//img[@alt='edit icon']")
	public static WebElement clickoneditskill;
	
	@FindBy(xpath = "(//input[@id='react-select-4-input'])[1]")
	public static WebElement EnterSkill;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clickonskillSave;

	@FindBy(xpath = "//button[normalize-space()='Education']")
	public static WebElement clickonEducation;

	@FindBy(xpath = "//img[@alt='add icon']")
	public static WebElement clickonAddeducation;

	@FindBy(xpath = "//div[@class='AddEducationCardBodyMain']//div[1]//div[2]//div[1]//div[2]//div[2]//*[name()='svg']")
	public static WebElement clickonSchool;

	@FindBy(xpath = "(//div[@id='react-select-4-option-0'])[1]")
	public static WebElement clickonvit;

	@FindBy(xpath = "(//div[@aria-hidden='true'])[18]")
	public static WebElement enterdegreetype;

	@FindBy(xpath = "//div[@id='react-select-5-option-5']")
	public static WebElement selectScience;

	@FindBy(xpath = "(//*[name()='svg'][@class='css-8mmkcg'])[6]")
	public static WebElement clickspecialization;

	@FindBy(xpath = "(//div[@id='react-select-6-option-2'])[1]")
	public static WebElement selectspecialization;

	@FindBy(xpath = "//div[@class='ant-picker-input']")
	public static WebElement clickonpassingyear;

	@FindBy(xpath = "//div[normalize-space()='2020']")
	public static WebElement selectpassingyear;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[1]")
	public static WebElement clickonscore;

	@FindBy(xpath = "(//li[@id='auto-highlight-option-1'])[1]")
	public static WebElement selectcgpa;

	@FindBy(xpath = "//input[@id='outlined-basic']")
	public static WebElement enterYOurScore;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[2]")
	public static WebElement clickonMedium;

	@FindBy(xpath = "//li[@id='auto-highlight-option-0']")
	public static WebElement selectEnglish;

	@FindBy(xpath = "(//div[@id='Save'])[1]")
	public static WebElement clickoneducationSave;

	@FindBy(xpath = "//button[normalize-space()='Job Preference']")
	public static WebElement ClickonJobpreference;

	@FindBy(xpath = "//div[@class='icon-shadow-wrapper']")
	public static WebElement ClickonAddinJobpreference;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/span[2]")
	public static WebElement clickoncurretsalary;

	@FindBy(xpath = "//div[contains(text(),'4 Lacs')]")
	public static WebElement selectsalaryinlack;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	public static WebElement clickontsalryinthousand;

	@FindBy(xpath = "//div[contains(text(),'20 Thousand')]")
	public static WebElement selectsalryinthousand;

	@FindBy(xpath = "(//div[@class='display-container my-3']//div[@class='ant-select ant-select-single ant-select-show-arrow ant-select-show-search'])[2]//div[@class='ant-select-selector']")
	public static WebElement clickExpectedSalaryDropdown;

	@FindBy(xpath = "//div[@title='6 Lacs']")
	public static WebElement selectExpectedSalary;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[8]/div[2]/div[2]/div[1]/span[2]")
	public static WebElement clickExpectedSalaryinThousand;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='20 Thousand'])[2]")
	public static WebElement selectExpectedSalaryinThousand;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clicksaveinJobpreference;

	@FindBy(xpath = "//button[normalize-space()='Certifications']")
	public static WebElement clickonCertification;

	@FindBy(xpath = "//img[contains(@alt,'add icon')]")
	public static WebElement clickonAddCertification;

	@FindBy(xpath = "(//input[contains(@type,'text')])[1]")
	public static WebElement enterCertificationName;

	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	public static WebElement enterCertifiedBy;

	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public static WebElement enterLink;

//@FindBy(xpath = "(//input[@type='text'])[4]")
//public static WebElement clickIssuedDate ;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	public static WebElement enterIssuedDate;

//@FindBy(xpath = "//div[6]//div[2]//div[1]//div[1]//input[1]")
//public static WebElement clickonLifetimeValid ;

	@FindBy(xpath = "(//input[contains(@name,'gradesvalid')])[2]")
	public static WebElement clickonNotApplicable;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clickonSaveinCertification;

	@FindBy(xpath = "//button[normalize-space()='Work Experience']")
	public static WebElement ClickonWorkExperience;

	@FindBy(xpath = "//img[@alt='add icon']")
	public static WebElement ClickonAddWorkExperience;

	@FindBy(xpath = "//input[@id='react-select-4-input']")
	public static WebElement enterCompanyName;

	@FindBy(xpath = "//input[@value='true']")
	public static WebElement clickonCurrentCompany;

	@FindBy(xpath = "(//input[@id='react-select-5-input'])[1]")
	public static WebElement enterIndustryType;

	@FindBy(xpath = "(//input[@id='react-select-6-input'])[1]")
	public static WebElement enterDesignstion;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	public static WebElement enterWorkFromDate;

	@FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
	public static WebElement enterLPA;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement clickonSaveinWorkExperience;

	@FindBy(xpath = "//button[normalize-space()='Training Institution']")
	public static WebElement ClickonTrainingInstitution;

	@FindBy(xpath = "//img[@alt='add icon']")
	public static WebElement ClickonAddInstitution;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
	public static WebElement EnterTrainingName;

	@FindBy(xpath = "(//input[@id='react-select-4-input'])[1]")
	public static WebElement EnterInstituteName;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public static WebElement ClickonStartDate;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	public static WebElement ClickonEndDate;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public static WebElement EnterDescription;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement ClickonSaveInInstitute;

	@FindBy(xpath = "//button[normalize-space()='Projects']")
	public static WebElement ClickonProjects;

	@FindBy(xpath = "//div[@class='icon-shadow-wrapper']")
	public static WebElement ClickonAddProjects;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
	public static WebElement EnterProjectName;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]")
	public static WebElement EnterRole;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[1]")
	public static WebElement ClickProjectDurationYear;

	@FindBy(xpath = "(//li[@id='auto-highlight-option-0'])[1]")
	public static WebElement SelectProjectDurationYear;

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root'])[2]")
	public static WebElement ClickProjcetDurationMonth;

	@FindBy(xpath = "(//li[@id='auto-highlight-option-2'])[1]")
	public static WebElement SelectProjcetDurationMonth;

	@FindBy(xpath = "//div[5]//div[2]//div[1]//input[1]")
	public static WebElement EnterTechnology;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public static WebElement EnterProjectDescription;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement ClickSaveinProjects;

	@FindBy(xpath = "//button[normalize-space()='Personal Information']")
	public static WebElement ClickonPersonalInformation;

	@FindBy(xpath = "//img[@alt='Pencil']")
	public static WebElement ClickonAddPersonalInformation;

	@FindBy(xpath = "//input[@value='MALE']")
	public static WebElement ClickonMale;

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	public static WebElement ClickonLanguages;

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='English']")
	public static WebElement SelectLanguage1;

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Kannada']")
	public static WebElement SelectLanguage2;

	@FindBy(xpath = "//input[@id='outlined-basic']")
	public static WebElement EnterPincode;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement ClickonSaveinPersonalInforamtion;

	@FindBy(xpath = "//button[normalize-space()='Resume Upload']")
	public static WebElement ClickonResumeUpload;

	@FindBy(xpath = "//button[normalize-space()='Update Resume']")
	public static WebElement ClickonUpdateResume;

	@FindBy(xpath = "//button[@class='ant-btn submit-btn-profile-resume-upload']")
	public static WebElement ClickonSubmitButton;

	@FindBy(xpath = "//input[@id='inputFile']")
	public static WebElement clickoninputfile;
	
	@FindBy(xpath = "//button[normalize-space()='Cover Story']")
	public static WebElement ClickonCoverStory ;

	@FindBy(xpath = "//span[normalize-space()='Upload/Create']")
	public static WebElement ClickonUploadorCreate ;

	@FindBy(xpath = "//span[normalize-space()='Submit']")
	public static WebElement ClickonSubminCoverStory ;

	@FindBy(xpath = "//button[@role='switch']   ")
	public static WebElement ClickonToggleButton ;

	@FindBy(xpath = "//span[normalize-space()='Browse files']")
	public static WebElement clickonbrowesfile ;

	@FindBy(xpath = "//button[normalize-space()='Links']")
	public static WebElement ClickonLinks ;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public static WebElement EnterGithubLink ;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public static WebElement EnterLinkdenLink ;

	@FindBy(xpath = "//div[@id='Save']")
	public static WebElement  ClickSaveLinks;

}
