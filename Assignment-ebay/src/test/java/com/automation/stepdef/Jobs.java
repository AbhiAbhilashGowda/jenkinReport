package com.automation.stepdef;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.JobsPage;
import com.automation.pages.LoginPage;

import io.cucumber.java.en.Then;

public class Jobs extends Base {

	
    	JobsPage scend = new JobsPage();
    	LoginPage scenA = new LoginPage();

    	@Then("^I click on jobs$")
    	public void i_click_on_jobs() throws Throwable {
    		Thread.sleep(2000);
    	Elements.click(JobsPage.clickonjobs);
    		Thread.sleep(4000);

    	}

    	@Then("^I select first job$")
    	public void i_select_first_job() throws Throwable {

    		Thread.sleep(2000);
    		Elements.click(JobsPage.clickonfirstjob);
    		Set<String> handles = driver.getWindowHandles();
    		Iterator<String> it = handles.iterator();
    		while (it.hasNext()) {
    			String parent = it.next();
    			String newwin = it.next();
    			driver.switchTo().window(newwin);
    			Thread.sleep(5000);
    		}
    	
    	}

    	@Then("^I click on copylink$")
    	public void i_select_share_on_mail() throws Throwable {
    		Thread.sleep(2000);
    		Elements.click(JobsPage.clickoncopylink);
    		Thread.sleep(4000);

    	}
    	@Then("^I drag experience to 0 to 2 years$")
        public void i_drag_experience_to_0_to_2_years() throws Throwable {
    		int x=2;
    		   WebElement slider = driver.findElement(By.xpath("(//span[@class='MuiSlider-track css-1t2bqnt'])[1]"));
    		   int width = slider.getSize().getWidth();
    		   Actions act= new Actions(driver);
    		   act.moveToElement(slider, ((width*x)/100), 0).click();
    		   act.build().perform();
    		   Thread.sleep(2000);

    		
    	 }
        @Then("^I fetch all Jobs$")
        public void i_fetch_all_jobs() throws Throwable {
        	Thread.sleep(3000);
        	List<WebElement> allJobsName=driver.findElements(By.xpath("//a[starts-with(@class,'job-title')]"));
        	System.out.println("The size of the jobs is : " + allJobsName.size());
    		for(WebElement Jobname:allJobsName)
    		{
    			String pn=Jobname.getText();
        
        System.out.println(pn);
        }
        }
    		
        

        @Then("^I select jobType in checkbox$")
        public void i_select_jobtype_in_checkbox() throws Throwable {
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
        	Thread.sleep(2000);
        	JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,300)", "");
        	
        	
            
        }

        @Then("^I click on More in Locations$")
        public void i_click_on_more_in_locations() throws Throwable {
        	Thread.sleep(2000);
        	Elements.click(JobsPage.ClickonMoreLocations);
            
        }

        @Then("^I select places and click apply$")
        public void i_select_places_and_click_apply() throws Throwable {
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[23]")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[34]")).click();
        	Thread.sleep(2000);
        	Elements.click(JobsPage.ClickonApplyLocations);
        	Thread.sleep(4000);
        	JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,500)", "");
        	
            
        }

        @Then("^I select industries and click apply$")
        public void i_select_industries_and_click_apply() throws Throwable {
    		Thread.sleep(1000);
    		Elements.click(JobsPage.ClickMoreIndustry);
    		Thread.sleep(1000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[29]")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[33]")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("(//input[@type='checkbox'])[35]")).click();
        	Thread.sleep(4000);
        	Elements.click(JobsPage.ClickonApplyIndustry);
        	Thread.sleep(2000);
    		

        }

}