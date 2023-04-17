
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class LoginPage {
	
public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement enterusername;

@FindBy(xpath = "//input[@placeholder='Password']")
public static WebElement enterpassword;

@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
public static WebElement clickLogin;
}
