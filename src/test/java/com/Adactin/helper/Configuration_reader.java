package com.Adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration_reader {
	
	public static WebDriver driver;
	public static Properties p;
	public Configuration_reader() throws Throwable {
		File f= new File("C:\\Users\\ajayk\\eclipse-workspace\\adactin\\src\\test\\java\\com\\Adactin\\properties\\Configuration.properties");
		FileInputStream fs = new FileInputStream(f);
		p = new Properties();
		p.load(fs);
	}
	public String getBrowser() {
		String property = p.getProperty("browser");
		return property;

	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
		

	}

}
