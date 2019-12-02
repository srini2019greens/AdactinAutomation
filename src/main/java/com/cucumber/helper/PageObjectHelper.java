package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.base.SearchHotel;
import com.cucumber.base.homePage;

public class PageObjectHelper {
	public WebDriver driver;
	public PageObjectHelper(WebDriver xdriver) {
		this.driver=xdriver;
	}
	private homePage hp;
	private SearchHotel sh;

	
	public homePage getHp() {
		if (hp==null) {
			hp = new homePage(driver);
		}
		return hp;
	}

	public SearchHotel getSh() {
		if (sh==null) {
			sh = new SearchHotel(driver);
		}
		return sh;
	}
	
	

}
