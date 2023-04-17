package com.automation.stepdef;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.RegisterPage;
import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Register extends Base {

	RegisterPage scenA = new RegisterPage();
	Faker fkobj = new Faker();
	String Storedmail = null;

	@Given("^I launch application$")
	public void i_launch_the_application() throws InterruptedException {

		Base.driver.get(Base.reader.getUrl());
		Thread.sleep(2000);
		System.out.println("Launch the application");
	}

	@Then("I click on Register")
	public void i_click_on_register() throws Throwable {
	
		Thread.sleep(2000);
		Elements.click(RegisterPage.clickonRegister);
		Thread.sleep(3000);
	}

	@Then("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
		Elements.click(RegisterPage.enterFirstName);

		String firstName = fkobj.name().firstName();
		System.err.println(firstName);
		Elements.TypeText(RegisterPage.enterFirstName, firstName);

		Thread.sleep(4000);

	}

	@Then("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
		Elements.click(RegisterPage.enterLastName);
		String lastName = fkobj.name().lastName();
		System.err.println(lastName);
		Elements.TypeText(RegisterPage.enterLastName, lastName);
		Thread.sleep(2000);

	}

	@Then("I open new TAB enter URl")
	public void i_open_new_tab_enter_u_rl() throws Throwable {
//		Thread.sleep(2000);
//		Base.driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(2000);
//		Base.driver.get("https://www.mail7.io/");
//		Thread.sleep(2000);
//	
//		Elements.click(RegisterPage.clickonCreateEmail);
//		Thread.sleep(2000);
//		Elements.click(RegisterPage.clickonOpenInbox);
	}

	@Then("^I enter New emailid$")
	public void i_enter_new_emailid() throws Throwable {
		Thread.sleep(200);
		Elements.click(RegisterPage.enterRandomEmail);
		Thread.sleep(1000);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		WebElement upload = Base.driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		String cred = "username" + randomInt + "@mail7.io";
		upload.sendKeys(cred);
		Storedmail = cred ;
		System.out.println(Storedmail);
		Elements.selectAll(RegisterPage.enterRandomEmail);
		Elements.copyAll(RegisterPage.enterRandomEmail);
//		Base.driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		Thread.sleep(2000);
//		Base.driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys(Keys.chord(Keys.CONTROL, "c"));

	}

	@Then("^I enter New password \"([^\"]*)\"$")
	public void i_enter_new_password_something(String pass) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(RegisterPage.enterNewPassword, pass);
		Thread.sleep(2000);

	}

	@Then("^I click on Register button$")
	public void i_click_on_register_button() throws Throwable {
		Thread.sleep(2000);
		Elements.click(RegisterPage.clickRegisterforRegisteration);
		Thread.sleep(200);
		Base.driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(200);
		Base.driver.get("https://www.mail7.io/");
		Thread.sleep(2000);
		Elements.click(RegisterPage.lounchinginbox);
		Thread.sleep(1000);
	Elements.pasteAll(RegisterPage.lounchinginbox);
		//Elements.TypeText(RegisterPage.lounchinginbox, Storedmail);
		Thread.sleep(2000);
	// Base.driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		Elements.click(RegisterPage.gotoInbox);
		Thread.sleep(2000);

		Elements.click(RegisterPage.clickonE2eInbox);
		Thread.sleep(3000);
		Base.driver.switchTo().frame(0);
		Actions act = new Actions(Base.driver);
		WebElement element = Base.driver.findElement(By.cssSelector("tbody tr td span"));
		act.doubleClick(element).build().perform();
		Thread.sleep(1000);

		WebElement otp = Base.driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[3]/td[1]"));
		String verify = otp.getText();
		Thread.sleep(1000);
		System.out.println(verify);
		System.err.println(verify);
		Thread.sleep(1000);
		Set<String> allWindows = Base.driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		Base.driver.switchTo().window(tabs.get(0));
		Elements.TypeText(RegisterPage.passotp, verify);
		Thread.sleep(2000);

		Elements.click(RegisterPage.verifyOtp);
		Thread.sleep(2000);

	}

	@Then("^I enter registered emailid$")
	public void i_enter_registered_emailid() throws Throwable {
		Thread.sleep(2000);
		Elements.click(RegisterPage.enterRandomEmail);
		Thread.sleep(5000);
		//Elements.TypeText(RegisterPage.enterRandomEmail,Storedmail);
		Thread.sleep(1000);
		Elements.pasteAll(RegisterPage.enterRandomEmail);
		//Base.driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}

	@Then("^I enter registered password \"([^\"]*)\"$")
	public void i_enter_registered_password_something(String pass) throws Throwable {
		Thread.sleep(200);
		Elements.TypeText(RegisterPage.enterNewPassword, pass);
		Thread.sleep(200);
		Elements.click(RegisterPage.clickReLogin);
		Thread.sleep(4000);

	}

	@Then("^I click on me$")
	public void i_click_on_me() throws Throwable {
		Thread.sleep(2000);
		Elements.click(RegisterPage.clickonMe);
		Thread.sleep(2000);
	}

	@Then("^I  click on settings and privacy$")
	public void i_click_on_settings_and_privacy() throws Throwable {
		Thread.sleep(2000);
		Elements.click(RegisterPage.clickonSettingAndPrivacy);

	}

	@Then("^I click on delete account permentaly$")
	public void i_click_on_delete_account_permentaly() throws Throwable {
		Thread.sleep(1000);
		Elements.click(RegisterPage.clickOnDeleteAccount);

	}

	@Then("^I click on confirm delete$")
	public void i_click_on_confirm_delete() throws Throwable {
		Thread.sleep(2000);
		Elements.click(RegisterPage.clickonReDelete);
		Thread.sleep(2000);

	}

	@Then("^I enter otp$")
	public void i_enter_otp() throws Throwable {
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(200);
		Base.driver.get("https://www.mail7.io/");
		Elements.click(RegisterPage.lounchinginbox);
		Thread.sleep(2000);
		Elements.pasteAll(RegisterPage.lounchinginbox);
      // Elements.TypeText(RegisterPage.lounchinginbox, Storedmail);by storing in variable
		//Base.driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys(Keys.chord(Keys.CONTROL, "v"));by pasting using keys
		Thread.sleep(200);
		Elements.click(RegisterPage.gotoInbox);
		Thread.sleep(4000);
		Elements.click(RegisterPage.clickonE2eInbox);
		Thread.sleep(4000);
		Base.driver.switchTo().frame(0);
		Actions act = new Actions(Base.driver);
		WebElement element = Base.driver.findElement(By.cssSelector("tbody tr td span"));
		act.doubleClick(element).build().perform();
		Thread.sleep(1000);
		WebElement otp = Base.driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[3]/td[1]"));
		String verify = otp.getText();
		Thread.sleep(1000);
		System.out.println(verify);
		System.err.println(verify);
		Thread.sleep(1000);
		Set<String> allWindows = Base.driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		Base.driver.switchTo().window(tabs.get(0));
		Elements.TypeText(RegisterPage.passotp, verify);
		Thread.sleep(2000);

	}

	@Then("^I click on delete account$")
	public void i_click_on_delete_account() throws Throwable {
		Elements.click(RegisterPage.clickonDelete);
		Thread.sleep(5000);

	}

}