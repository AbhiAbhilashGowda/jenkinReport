
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class CoursesPage {
	
public CoursesPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//div[@class='d-flex']//div[@class='navbar-wrapper-title'][normalize-space()='Courses']")
public static WebElement clickoncourses;

@FindBy(xpath = "(//div[normalize-space()='Course Publish linkedin'])[1]")
public static WebElement clickon1stcourse;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/button[1]/img[1]")
public static WebElement clickonwhatsupshare;
	
}
