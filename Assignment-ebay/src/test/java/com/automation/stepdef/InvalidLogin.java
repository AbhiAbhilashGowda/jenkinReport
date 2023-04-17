//package com.automation.stepdef;
//
//import com.automation.base.Base;
//import com.automation.framework.Elements;
//import com.automation.pages.InvalidLoginPage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class InvalidLogin extends Base {
//
//	InvalidLoginPage scenA = new InvalidLoginPage();
//



//	@Given("^I launch the application$")
//	public void i_launch_the_application() throws InterruptedException {
//
//		Base.driver.get(Base.reader.getUrl());
//		Thread.sleep(2000);
//		System.out.println("Launch the application");
//	}
//
//	@When("^I enter invalid emailid \"([^\"]*)\"$")
//	public void i_enter_invalid_emailid_something(String invalid) throws Throwable {
//		Thread.sleep(2000);
//		Elements.TypeText(InvalidLoginPage. InvalidUsername, invalid);
//	}
//
//	@When("^I enter invalid password \"([^\"]*)\"$")
//	public void i_enter_invalid_password_something(String invalidpassword) throws Throwable {
//		Thread.sleep(2000);
//		Elements.TypeText(InvalidLoginPage.Invalidpassword, invalidpassword);
//
//	}
//
//	@When("^I enter valid emailid \"([^\"]*)\"$")
//	public void i_enter_valid_emailid_something(String invalid) throws Throwable {
//		Thread.sleep(2000);
//		Elements.TypeText(InvalidLoginPage. validUsername, invalid);
//
//	}
//
//	@When("^I enter valid password \"([^\"]*)\"$")
//	public void i_enter_valid_password_something(String Invalidpassword) throws Throwable {
//		Thread.sleep(2000);




//		Elements.TypeText(InvalidLoginPage.validpassword, Invalidpassword);
//
//	}
//
//	@Then("^I click on login button$")
//	public void i_click_on_login_button() throws Throwable {
//		Thread.sleep(2000);
//		Elements.click(InvalidLoginPage.clickLogin);
//
//	}
//
//	@Then("^I should get error message$")
//	public void i_should_get_error_message() throws Throwable {
//
//	}

//}