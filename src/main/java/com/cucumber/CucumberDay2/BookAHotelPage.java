package com.cucumber.CucumberDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {
	public static WebDriver driver;

	public BookAHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Back']")
	private WebElement back;

	public WebElement backBtn() {
		return back;
	}

	@FindBy(id = "hotel_name_dis")
	private WebElement hotelName;

	public WebElement hotelNameBox() {
		return hotelName;
	}

	@FindBy(id = "location_dis")
	private WebElement location;

	public WebElement locationBox() {
		return location;
	}

	@FindBy(id = "room_type_dis")
	private WebElement roomType;

	public WebElement roomTypeBox() {
		return roomType;
	}

	@FindBy(id = "room_num_dis")
	private WebElement numOfRooms;

	public WebElement numberOfRoomsBox() {
		return numOfRooms;
	}

	@FindBy(xpath = "//input[@name='total_days_dis']")
	private WebElement totalDays;

	public WebElement totalDaysBox() {
		return totalDays;
	}

	@FindBy(xpath = "//input[@name='price_night_dis']")
	private WebElement pricePerNyt;

	public WebElement pricePerNytBox() {
		return pricePerNyt;
	}

	@FindBy(id = "total_price_dis")
	private WebElement totalPrice;

	public WebElement totalPriceBox() {
		return totalPrice;
	}

	@FindBy(id = "gst_dis")
	private WebElement GST;

	public WebElement GSTbox() {
		return GST;
	}

	@FindBy(id = "final_price_dis")
	private WebElement finalPrice;

	public WebElement finalBilledPrice() {
		return finalPrice;
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	public WebElement firstNameBox() {
		return firstName;
	}

	@FindBy(id = "last_name")
	private WebElement lastName;

	public WebElement lastNameBox() {
		return lastName;
	}

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAddress;

	public WebElement billingAddressBox() {
		return billingAddress;
	}

	@FindBy(id = "cc_num")
	private WebElement creditCardNumber;

	public WebElement creditCardNumberBox() {
		return creditCardNumber;
	}

	@FindBy(id = "cc_type")
	private WebElement cardType;

	public WebElement cardTypeDD() {
		return cardType;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	public WebElement expiryMonthDD() {
		return expiryMonth;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	public WebElement expiryYearDD() {
		return expiryYear;
	}

	@FindBy(id = "cc_cvv")
	private WebElement CVV;

	public WebElement CVVnumber() {
		return CVV;
	}

	@FindBy(id = "book_now")
	private WebElement bookNow;

	public WebElement bookNowBtn() {
		return bookNow;
	}

	@FindBy(id = "cancel")
	private WebElement cancel;

	public WebElement cancelBtn() {
		return cancel;
	}

}
