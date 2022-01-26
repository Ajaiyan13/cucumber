package com.Adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.helper.File_reader_manager;
import com.adactin.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin\\feature\\Adactin.feature", glue = "com\\Adactin\\stepDefenition", plugin = {
		"pretty", "html:Report\\CucumberReport", "json:Report\\Cucumber.json" },
//		"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"}
		// tags = ("@Regressiontest"),
		monochrome = true, dryRun = false)

public class runnerClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_reader_manager.getInstancefr().getInstancecr().getBrowser();

		driver = Base_Class.getbrowser(browser);
	}
}
