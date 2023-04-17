
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class mentorshippPage {
	
public mentorshippPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//div[@class='d-flex']//img[@id='mentorship']")
public static WebElement clickonmentorship;

@FindBy(xpath = "//*[@id=\"rc-tabs-0-tab-1\"]")
public static WebElement clickonoverview;

@FindBy(xpath = "//*[@id=\"step_card_mentorship\"]/div/div[2]/div/a/button")
public static WebElement clickonregisterfororintation;
	
}
