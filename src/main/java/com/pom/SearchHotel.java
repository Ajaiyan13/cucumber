package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotel {
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement Roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Roomnos;
	
	@FindBy(id="adult_room")
	private WebElement Adultrooms;
	
	@FindBy(id="child_room")
	private WebElement Childrooms;
	
	@FindBy(id="Submit")
	private WebElement Submit;

	public SearchHotel(WebDriver krish2) {
		this.driver=krish2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomnos() {
		return Roomnos;
	}

	public WebElement getAdultrooms() {
		return Adultrooms;
	}

	public WebElement getChildrooms() {
		return Childrooms;
	}

	public WebElement getSubmit() {
		return Submit;
	}

}
