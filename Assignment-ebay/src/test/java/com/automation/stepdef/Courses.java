package com.automation.stepdef;
import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.CoursesPage;
import com.automation.pages.LoginPage;

import io.cucumber.java.en.Then;

public class Courses extends Base {


    	CoursesPage scene = new CoursesPage();
    	LoginPage scenA = new LoginPage();

    	 
    	   

    	@Then("^I click on Courses menu$")
        public void i_click_on_courses_menu() throws Throwable {
    		Thread.sleep(2000);
    		Elements.click(CoursesPage.clickoncourses);
    		Thread.sleep(4000);
           
        }

        @Then("^I click on First courses$")
        public void i_click_on_first_courses() throws Throwable {
        	Thread.sleep(2000);
        	Elements.click(CoursesPage.clickon1stcourse);
          
        }

        @Then("^I click on share Through Whatsup$")
        public void i_click_on_share_through_whatsup() throws Throwable {
        	Thread.sleep(2000);
        	Elements.click(CoursesPage.clickonwhatsupshare);
           
        }


    	   }

