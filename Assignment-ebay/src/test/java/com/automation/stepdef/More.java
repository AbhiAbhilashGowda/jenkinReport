package com.automation.stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.LoginPage;
import com.automation.pages.MorePage;

import io.cucumber.java.en.Then;

public class More extends Base{
	
    	MorePage scene = new MorePage();
    	LoginPage scenA = new LoginPage();

    	 @Then("^I click on More menu$")
    	    public void i_click_on_more_menu() throws Throwable {
    		 Thread.sleep(2000);
    		 Elements.click(MorePage.ClickonMore);
    		 
    	        
    	    }

    	    @Then("^I click on job fair$")
    	    public void i_click_on_job_fair() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonJobFair);
    	        
    	    }

    	    @Then("^I click on ongoing$")
    	    public void i_click_on_ongoing() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonOngoing);
    	    }

    	    @Then("^I click on completed$")
    	    public void i_click_on_completed() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonComplited);
    	    }

    	    @Then("^I click on Bootcamp$")
    	    public void i_click_on_bootcamp() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonBootCamp);
    
    	    }

    	    @Then("^I click on First option$")
    	    public void i_click_on_first_option() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonFirstBootcamp);
    
    	    }

    	    @Then("^I click on partners$")
    	    public void i_click_on_partners() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickOnPartenars);
    
    	    }

    	    @Then("^I click on All companies$")
    	    public void i_click_on_all_companies() throws Throwable {
    	    	
    	    }

    	    @Then("^I click on All colleges$")
    	    public void i_click_on_all_colleges() throws Throwable {
    	    	Thread.sleep(2000);
    	    Elements.click(MorePage.clickonAllColleges);
    	    Thread.sleep(2000);
    	        
    	    }

    	    @Then("^I click on All Institutes$")
    	    public void i_click_on_all_institutes() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonAllInstitute);
    	        
    	    }

    	    @Then("^I click on Blogs$")
    	    public void i_click_on_blogs() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonBlogs);
    	        
    	    }

    	    @Then("^I click on my blogs$")
    	    public void i_click_on_my_blogs() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonMyBlogs);
    	    	Thread.sleep(2000);
    
    	    }

    	    @Then("^I click on newsroom$")
    	    public void i_click_on_newsroom() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonNewsRoom);
    	    	Thread.sleep(2000);
    	        
    	    }

    	    @Then("^I click on Team$")
    	    public void i_click_on_team() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonTeam);
    	    	Thread.sleep(2000);
    	    	
    	    	
    	        
    	    }

    	    @Then("^I click on FirstTeam$")
    	    public void i_click_on_firstteam() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Actions act=new Actions(driver);
    	    	WebElement element=driver.findElement(By.xpath("//div[@class='org-people-info']//a"));
    	    	act.moveToElement(element).click().perform();
    	    	Thread.sleep(2000);
    	    	//Elements.click(MorePage.clickFirstTeam);
    
    	    }

    	    @Then("^I click on FAQs$")
    	    public void i_click_on_faqs() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickOnFAQs);
    
    	    }

    	    @Then("^I click on How to apply jobs$")
    	    public void i_click_on_how_to_apply_jobs() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.ClikonHowtoApply);
    	        
    	    }

    	    @Then("^I click on Testimonials$")
    	    public void i_click_on_testimonials() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonTestimonials);
    	        
    	    }

    	    @Then("^I click on Recrutiters$")
    	    public void i_click_on_recrutiters() throws Throwable {
    	    	Thread.sleep(2000);
    	    	Elements.click(MorePage.clickonRecruiters);
    	        
    	    }

    	    @Then("^I click on Candidates$")
    	    public void i_click_on_candidates() throws Throwable {
    	    	Thread.sleep(2000);
    	        Elements.click(MorePage.clickonCandidates);
    	    }

    	    @Then("^I click on Campus$")
    	    public void i_click_on_campus() throws Throwable {
    	        Thread.sleep(2000);
    	        Elements.click(MorePage.clickonCampus);
    	    }

    	
    	   }

