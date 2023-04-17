
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class InvalidLoginPage {
	
public InvalidLoginPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement InvalidUsername;

@FindBy(xpath = "//input[@placeholder='Password']")
public static WebElement Invalidpassword;

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement validUsername;

@FindBy(xpath = "//input[@placeholder='Password']")
public static WebElement validpassword;

@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
public static WebElement clickLogin;
}
