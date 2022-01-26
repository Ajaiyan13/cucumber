package com.Adactin.stepDefenition;

import org.openqa.selenium.WebDriver;

import com.Adactin.runner.runnerClass;
import com.adactin.baseclass.Base_Class;
import com.pom.manager.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	public static WebDriver driver = runnerClass.driver;
//LoginPage lp= new LoginPage(driver);
//SearchHotel sh= new SearchHotel(driver);
//SelectHotel sl= new SelectHotel(driver);
//BookHotel bh= new BookHotel(driver);

	Page_Object_Manager pom = new Page_Object_Manager(driver);
	@Given("the user is logged in")
	public void the_user_is_logged_in() {
	}

	@Given("goes to landing page")
	public void goes_to_landing_page() {
	}


	@Given("^user launch the application$")
	public void user_launch_the_application() {
		geturl("http://adactinhotelapp.com/index.php");

	}

	@When("^user enter the \"([^\"]*)\" in the username field$")
	public void user_enter_the_in_the_username_field(String username) {
		sendkeys(pom.getLp().getUsername(), username);
	}

	@When("^user enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String password) {
		sendkeys(pom.getLp().getPassword(), password);
	}

//@When("^user enter the username$")
//public void user_enter_the_username(String username)  {
////	sendkeys(lp.getUsername(), "ajaykrishnan");
//	sendkeys(pom.getLp().getUsername(), username);
//	
//}
//
//@When("^user enter the password$")
//public void user_enter_the_password(String password)  {
////	sendkeys(lp.getPassword(), "ajay@123");
//	sendkeys(pom.getLp().getPassword(), password);
//}

	@When("^user click the login button$")
	public void user_click_the_login_button() {
//	click(lp.getLogin());
		click(pom.getLp().getLogin());
	}

	@Then("^user verify the login page navigate to search hotel$")
	public void user_verify_the_login_page_navigate_to_search_hotel() {
	}

	@When("^user select the location$")
	public void user_select_the_location() {
//	dropdown("value", sh.getLocation(), "Brisbane");
		dropdown("value", pom.getSh().getLocation(), "Brisbane");
	}

	@When("^user able to search hotel$")
	public void user_able_to_search_hotel() {
//	dropdown("value", sh.getHotels(), "Hotel Sunshine");
		dropdown("value", pom.getSh().getHotels(), "Hotel Sunshine");
	}

	@When("^user able to select room type$")
	public void user_able_to_select_room_type() {
//	dropdown("value", sh.getRoomtype(), "Double");
		dropdown("value", pom.getSh().getRoomtype(), "Double");
	}

	@When("^user able to select number of rooms$")
	public void user_able_to_select_number_of_rooms() {
//	dropdown("value", sh.getRoomnos(), "4");
		dropdown("value", pom.getSh().getRoomnos(), "4");
	}

	@When("^user able to select number of adults in a room$")
	public void user_able_to_select_number_of_adults_in_a_room() {
//	dropdown("value", sh.getAdultrooms(), "3");
		dropdown("value", pom.getSh().getAdultrooms(), "3");
	}

	@When("^user able to select number of children$")
	public void user_able_to_select_number_of_children() {
//	dropdown("value", sh.getChildrooms(), "4");
		dropdown("value", pom.getSh().getChildrooms(), "4");
	}

	@Then("^user verify the search page navigate to confirmation$")
	public void user_verify_the_search_page_navigate_to_confirmation() {
//	click(sh.getSubmit());
		click(pom.getSh().getSubmit());
	}

	@When("^user confirm the given details$")
	public void user_confirm_the_given_details() {
		click(pom.getSl().getRadiobutton());

	}

	@Then("^user verify the continue page navigate to book a hotel$")
	public void user_verify_the_continue_page_navigate_to_book_a_hotel() {
//	click(sl.getContinue());
		click(pom.getSl().getContinue());
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name() {
//	sendkeys(bh.getFirstname(), "ajay");
		sendkeys(pom.getBh().getFirstname(), "ajay");
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name() {
//	sendkeys(bh.getLastname(), "krish");
		sendkeys(pom.getBh().getLastname(), "krish");
	}

	@When("^user enter the billing address$")
	public void user_enter_the_billing_address() {
//	sendkeys(bh.getAddress(), "40.g3 rbi chennai");
		sendkeys(pom.getBh().getAddress(), "40.g3 rbi chennai");
	}

	@When("^user enter the credit card details$")
	public void user_enter_the_credit_card_details() {
//	sendkeys(bh.getCcnumber(), "1234567891011121");
		sendkeys(pom.getBh().getCcnumber(), "1234567891011121");
	}

	@When("^user able to select credit card type$")
	public void user_able_to_select_credit_card_type() {
//	dropdown("value", bh.getCardtype(), "MAST");
		dropdown("value", pom.getBh().getCardtype(), "MAST");
	}

	@When("^user able to select expiry month in credit card$")
	public void user_able_to_select_expiry_month_in_credit_card() {
//	dropdown("value", bh.getExpirymonth(), "5");
		dropdown("value", pom.getBh().getExpirymonth(), "5");
	}

	@When("^user able to selct expiry year$")
	public void user_able_to_selct_expiry_year() {
//	dropdown("value", bh.getExpiryyear(), "2022");
		dropdown("value", pom.getBh().getExpiryyear(), "2022");
	}

	@When("^user enters the cvv number$")
	public void user_enters_the_cvv_number() {
//	sendkeys(bh.getCvvnumber(), "689");
		sendkeys(pom.getBh().getCvvnumber(), "689");
	}

	@Then("^verify the details and book the hotel$")
	public void verify_the_details_and_book_the_hotel() {
		// click(bh.getBooknow());
		click(pom.getBh().getBooknow());
	}

}
