package com.automation.stepdef;

import org.openqa.selenium.JavascriptExecutor;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.LoginPage;
import com.automation.pages.mentorshippPage;

import io.cucumber.java.en.Then;

public class Mentorshipp extends Base {

	
    	mentorshippPage scene = new mentorshippPage();
    	LoginPage scenA = new LoginPage();

    	 
    	   

    	    @Then("^I click on mentorship$")
    	    public void i_click_on_mentorship() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(mentorshippPage.clickonmentorship);
    
    	    }

    	    @Then("^I click on overview$")
    	    public void i_click_on_overview() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(mentorshippPage.clickonoverview);
    	    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	    	jse.executeScript("window.scrollBy(0,1000)", "");
    	    }

    	    @Then("^I click on Register for orientation$")
    	    public void i_click_on_Register_for_orientation() throws Exception {
    	        Thread.sleep(2000);
    	    	Elements.click(mentorshippPage.clickonregisterfororintation);
    	        
    	    }

    	   }

