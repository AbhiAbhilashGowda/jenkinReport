
package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class RegisterPage {
	
public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	

@FindBy(xpath = "//span[@class='login-text']")
public static WebElement clickonRegister;

@FindBy(xpath = "//input[@name='firstname']")
public static WebElement enterFirstName;

@FindBy(xpath = "//input[@name='lastname']")
public static WebElement enterLastName;

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement enterRandomEmail;

@FindBy(xpath = "(//input[@name='username'])[1]")
public static WebElement clickonCreateEmail;

@FindBy(xpath = "//input[@class='button is-primary w-50']")
public static WebElement clickonOpenInbox;

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement clickonCopyEmail;

@FindBy(xpath = "//input[@id='deusername']")
public static WebElement clickonPasteEmail;

@FindBy(xpath = "//input[@class='ant-input']")
public static WebElement enterNewPassword;

@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement printmail;

@FindBy(xpath = "(//input[@name='username'])[1]")
public static WebElement lounchinginbox;

@FindBy(xpath = "(//input[@class='button is-primary w-50'])[1]")
public static WebElement gotoInbox;		
	
@FindBy(xpath = "(//p[normalize-space()='/ info@e2ehiring.com'])[1]")
public static WebElement clickonE2eInbox;	

@FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
public static WebElement pasteotp;

@FindBy(xpath = "//span[normalize-space()='Verify Email']")
public static WebElement verifyOtp;


@FindBy(xpath = "//input[@aria-label='Please enter verification code. Digit 1']")
public static WebElement passotp;

@FindBy(xpath = "//button[@type='button']")
public static WebElement clickRegisterforRegisteration;

@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
public static WebElement clickReLogin;

@FindBy(xpath = "//div[@class='desktop-navbar d-flex align-items-center']//img[@alt='avtar']")
public static WebElement clickonMe;

@FindBy(xpath = "(//button[@class='user-contact-details-button-navbar'])[2]")
public static WebElement clickonSettingAndPrivacy;


@FindBy(xpath = "//button[normalize-space()='Delete account permanently']")
public static WebElement clickOnDeleteAccount;

@FindBy(xpath = "//span[normalize-space()='Delete Account']")
public static WebElement clickonReDelete;

@FindBy(xpath = "//button[normalize-space()='Delete account']")
public static WebElement clickonDelete;

}
