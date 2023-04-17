
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class MorePage {

	public MorePage() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "//div[@class='desktop-navbar d-flex align-items-center']//div[@id='more-navigation']")
	public static WebElement ClickonMore ;

	@FindBy(xpath = "(//img[@id='team'])[1]")
	public static WebElement clickonJobFair ;

	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	public static WebElement clickonOngoing ;

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
	public static WebElement clickonComplited ;

	@FindBy(xpath = "//img[@id='EventActive']")
	public static WebElement clickonBootCamp;

	@FindBy(xpath = "//div[@class='boot-camp-event-details-wrapper']")
	public static WebElement clickonFirstBootcamp ;

	@FindBy(xpath = "//img[@id='PartnersActive']")
	public static WebElement clickOnPartenars ;

	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	public static WebElement clickonAllColleges ;

	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[2]")
	public static WebElement clickonAllInstitute ;
	
	@FindBy(xpath = "(//img[@id='more'])[3]")
	public static WebElement clickonBlogs;

	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	public static WebElement clickonMyBlogs ;

	@FindBy(xpath = "(//img[@id='more'])[4]")
	public static WebElement clickonNewsRoom;

	@FindBy(xpath = "(//img[@id='team'])[2]")
	public static WebElement clickonTeam ;
	
	@FindBy(xpath = "//section[@id='team-card']")
	public static WebElement clickFirstTeam ;

	@FindBy(xpath = "//img[@id='FaqsActive']")
	public static WebElement clickOnFAQs;

	@FindBy(xpath = "//img[@alt='addd']")
	public static WebElement ClikonHowtoApply ;

	@FindBy(xpath = "(//img[@id='more'])[5]")
	public static WebElement clickonTestimonials;

	@FindBy(xpath = "//button[normalize-space()='Recruiters']")
	public static WebElement clickonRecruiters;

	@FindBy(xpath = "//button[normalize-space()='Candidates']")
	public static WebElement clickonCandidates;
	
	@FindBy(xpath = "//a[@target='_blank']//img[@id='more']")
	public static WebElement clickonCampus;
	
//	@FindBy(xpath = "")
//	public static WebElement ;
//	
//	@FindBy(xpath = "")
//	public static WebElement ;
//	
//	@FindBy(xpath = "")
//	public static WebElement ;
//	
//	@FindBy(xpath = "")
//	public static WebElement ;
}
