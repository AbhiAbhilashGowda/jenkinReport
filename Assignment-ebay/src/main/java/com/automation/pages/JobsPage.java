
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class JobsPage {
	
public JobsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "(//img[@id='Jobs'])[1]")
public static WebElement clickonjobs;

@FindBy(xpath = "(//div[@class='result-job-card'])[1]")
public static WebElement clickonfirstjob;

@FindBy(xpath = "(//img[@loading='lazy'])[5]")
public static WebElement clickoncopylink;

@FindBy(xpath = "(//span[@class='MuiSlider-colorPrimary MuiSlider-sizeMedium MuiSlider-root css-gu8wfa'])[1]")
public static WebElement DragExperiencefromEnd;

@FindBy(xpath = "//button[normalize-space()='+87 More']")
public static WebElement  ClickonMoreLocations;

@FindBy(xpath = "//button[normalize-space()='Apply']")
public static WebElement ClickonApplyLocations;

@FindBy(xpath = "//button[normalize-space()='+23 More']")
public static WebElement ClickMoreIndustry ;

@FindBy(xpath = "//button[normalize-space()='Apply']")
public static WebElement ClickonApplyIndustry;

//@FindBy(xpath = "(//div)[148]")
//public static WebElement CopyAllJobs;

	
}
