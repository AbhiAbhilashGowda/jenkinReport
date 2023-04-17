package com.automation.stepdef;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.automation.base.Base;
import com.automation.config.PropertyFileReader;
import com.automation.framework.Browser;
import com.automation.util.PathHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static Logger log = Logger.getLogger(Hooks.class);

	@Before
	public void setUp(Scenario scenario) {
		PropertyConfigurator
				.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		log.info("Scenario Started: " + scenario.getName());
		Base.reader = new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
	}

	@After
	public void closeBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.attach(Browser.takeScreenshot(), "image/png", "failedmethod" + "");
		}
		log.info("Scenario Completed: " + scenario.getName());
		log.info("Scenario Status is: " + scenario.getStatus());
		Base.driver.quit();
	}

}
