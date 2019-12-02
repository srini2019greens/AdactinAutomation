package com.cucumber.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public static WebDriver driver;
	public SelectHotelPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(id="radiobutton_0")
	private WebElement firstRadioBtn;
	
	public WebElement firstRadioBtn() {
		return firstRadioBtn;
	}
	
	@FindBy(id="hotel_name_0")
	private WebElement firstHotel;
	
	public WebElement firstHotelText() {
		return firstHotel;
	}
	
	@FindBy(id="location_0")
	private WebElement firstLocation;
	
	public WebElement firstLocationText() {
		return firstLocation;
	}
	
	@FindBy(id="price_night_0")
	private WebElement firstPrice;
	
	public WebElement firstPricePerNight() {
		return firstPrice;
	}
	
	@FindBy(id="total_price_0")
	private WebElement totalPrice;
	
	public WebElement firsttotalPrice() {
		return totalPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
