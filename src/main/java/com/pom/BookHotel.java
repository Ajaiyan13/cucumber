package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement Firstname;
	
	@FindBy(id="last_name")
	private WebElement Lastname;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement Ccnumber;
	
	@FindBy(id="cc_type")
	private WebElement Cardtype; 
	
	@FindBy(id="cc_exp_month")
	private WebElement Expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement Cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement Booknow;

	public BookHotel(WebDriver krish2) {
		this.driver=krish2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcnumber() {
		return Ccnumber;
	}

	public WebElement getCardtype() {
		return Cardtype;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	public WebElement getCvvnumber() {
		return Cvvnumber;
	}

	public WebElement getBooknow() {
		return Booknow;
	}
	
	

}
