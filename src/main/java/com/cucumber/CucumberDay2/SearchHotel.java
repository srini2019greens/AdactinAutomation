package com.cucumber.CucumberDay2;

import org.hamcrest.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	public SearchHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username_show")
	private WebElement showUsername;
	
	public WebElement usernameVerification() {
		return showUsername;
	}
	
	@FindBy(xpath="Logout")
	private WebElement logOut;
	
	public WebElement signOut() {
		return logOut;
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	public WebElement locationDD() {
		return location;
	}
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	public WebElement hotelsDD() {
		return hotels;
	}
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	public WebElement roomTypeDD() {
		return roomType;
	}
	
	@FindBy(id="room_nos")
	private WebElement roomNumbers;
	
	public WebElement roomNumbersDD() {
		return roomNumbers;
	}
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	public WebElement checkInDate() {
		return checkIn;
	}
	
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	public WebElement checkOutDate() {
		return checkOut;
	}
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	public WebElement adultRoomDD() {
		return adultRoom;
	}
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	public WebElement childRoomDD() {
		return childRoom;
	}
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchBtn;
	
	public WebElement searchButton() {
		return searchBtn;
	}
	
	@FindBy(id="Reset")
	private WebElement reset;
	
	public WebElement resetBtn() {
		return reset;
	}
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;
	
	public WebElement bookedItineraries() {
		return bookedItinerary;
	}
	
	@FindBy(id="checkout_span")
	private WebElement checkOutError;
	
	public WebElement checkOutErrorDisplay() {
		return checkOutError;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
