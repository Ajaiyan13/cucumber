package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotel;
import com.pom.LoginPage;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class Page_Object_Manager {
	
	
	public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel sl;
	private BookHotel bh;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}
	public SelectHotel getSl() {
		sl=new SelectHotel(driver);
		return sl;
	}
	public BookHotel getBh() {
		bh=new BookHotel(driver);
		return bh;
	}

}
