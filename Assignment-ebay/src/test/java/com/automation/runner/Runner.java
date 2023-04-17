package com.automation.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {// "classpath:FeatureFiles/Login.feature",
		                   // "classpath:FeatureFiles/Mentorshipp.feature",
                             // "classpath:FeatureFiles/Jobs.feature",
                             //"classpath:FeatureFiles/InvalidLogin.feature",
                           // "classpath:FeatureFiles/Courses.feature",
                          // "classpath:FeatureFiles/More.feature",
		                  // "classpath:FeatureFiles/ProfileUpload.feature",
                         "classpath:FeatureFiles/Register.feature",
                        // "classpath:FeatureFiles/JObsSideMap.feature",
}, 
glue = { "classpath:com.automation.stepdef"}, 
   monochrome = true,
   publish = true,
		   plugin = { "pretty", 
		   		"html:target/cucumber_html_report",
		   		"json:target/cucumber.json",
		   		"junit:target/cucumber.xml" })
					// tags=("@delete"))
public class Runner{
}

		   		 
