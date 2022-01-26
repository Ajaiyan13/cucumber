package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement Radiobutton;

	@FindBy(id = "continue")
	private WebElement Continue;

	public SelectHotel(WebDriver krish2) {
		this.driver=krish2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return Radiobutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
