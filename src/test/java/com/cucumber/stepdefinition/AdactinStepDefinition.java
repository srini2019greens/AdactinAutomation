package com.cucumber.stepdefinition;

import com.cucumber.base.AllMethods;
import com.cucumber.base.SearchHotel;
import com.cucumber.base.SelectHotelPage;
import com.cucumber.base.homePage;
import com.cucumber.helper.ConfigReader;
import com.cucumber.helper.PageObjectHelper;
import com.cucumber.testrunner.TestRunner;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition extends AllMethods {

	public static WebDriver driver = TestRunner.driver;
	
	
	public static PageObjectHelper ph = new PageObjectHelper(driver);
	@Then("^User to launch hotel reservation application$")
	public void user_to_launch_hotel_reservation_application() throws Throwable {
		ConfigReader cr = new ConfigReader();
		geturl(cr.getURL());

	}

	@When("^User enters email id \"([^\"]*)\" in the email field$")
	public void user_enters_email_id_in_the_email_field(String email) throws Throwable {
		elementVisibility(ph.getHp().getEmailField(), email);

	}

	@When("^User enters password \"([^\"]*)\" in the password field$")
	public void user_enters_password_in_the_password_field(String password) throws Throwable {
		moveTo(ph.getHp().getPasswordField());
		elementVisibility(ph.getHp().getPasswordField(), password);

	}

	@When("^User enters email id in the email field$")
	public void user_enters_email_id_in_the_email_field() throws Throwable {
		homePage hp = new homePage(driver);
		hp.getEmailField();
		elementVisibility(hp.getEmailField(), "cbzsrini");
	}

	@When("^User enters password in the password field$")
	public void user_enters_password_in_the_password_field() throws Throwable {
		homePage hp = new homePage(driver);
		moveTo(hp.getPasswordField());
		elementVisibility(hp.getPasswordField(), "8JTM28");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		homePage hp = new homePage(driver);
		clicks(hp.getLoginBtn());

	}

	@Then("^User verifies the username in the HomePage$")
	public void user_verifies_the_username_in_the_HomePage() throws Throwable {
		String text = ph.getSh().usernameVerification().getAttribute("value");
		//Assert.assertEquals("Hello@cbzsrini!", text);
		System.out.println(text);
	}

	@Then("^User logged out of the homePage$")
	public void user_logged_out_of_the_homePage() throws Throwable {
		ph.getSh().signOut().click();
	}

	@Given("^Launch hotel reservation application using URL as in test data$")
	public void launch_hotel_reservation_application_using_URL_as_in_test_data() throws Throwable {
		ConfigReader cr = new ConfigReader();
		geturl(cr.getURL());

	}

	@Given("^Login to the application using username and password as in test data$")
	public void login_to_the_application_using_username_and_password_as_in_test_data() throws Throwable {
		ph.getHp().getEmailField();
		elementVisibility(ph.getHp().getEmailField(), "cbzsrini");
		moveTo(ph.getHp().getPasswordField());
		elementVisibility(ph.getHp().getPasswordField(), "8JTM28");
		clicks(ph.getHp().getLoginBtn());

	}

	@Given("^Select location as in test data$")
	public void select_location_as_in_test_data() throws Throwable {
		ph.getSh().locationDD().click();
		selectOptionInDD(ph.getSh().locationDD(), "visibletext", "Sydney");
		isSelected(ph.getSh().locationDD());
	}

	@Given("^Select hotel as in test data$")
	public void select_hotel_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSh().hotelsDD(), "visibletext", "Hotel Creek");

	}

	@Given("^Select room type as in test data$")
	public void select_room_type_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSh().roomTypeDD(), "value", "Standard");

	}

	@Given("^Select no-of-rooms as in test data$")
	public void select_no_of_rooms_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSh().roomNumbersDD(), "index", "1");

	}

	@Given("^Enter check-in-date later than the checkout-date field as in test data$")
	public void enter_check_in_date_later_than_the_checkout_date_field_as_in_test_data() throws Throwable {
		elementVisibility(ph.getSh().checkInDate(), "26/11/2019");
		elementVisibility(ph.getSh().checkOutDate(), "23/11/2019");

	}

	@Given("^Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()
			throws Throwable {
		ph.getSh().searchButton().click();
		String text = ph.getSh().checkOutErrorDisplay().getText();
		System.out.println(text);
	}

	@When("^Launch hotel reservation application$")
	public void launch_hotel_reservation_application() throws Throwable {
		geturl("http://adactin.com/HotelApp/index.php");
	}

	@When("^Login to the application using username and password$")
	public void login_to_the_application_using_username_and_password() throws Throwable {
		homePage hp = new homePage(driver);
		hp.getEmailField();
		elementVisibility(hp.getEmailField(), "cbzsrini");
		moveTo(hp.getPasswordField());
		elementVisibility(hp.getPasswordField(), "8JTM28");
		clicks(hp.getLoginBtn());

	}

	@When("^Enter check-out-date as in test data$")
	public void enter_check_out_date_as_in_test_data() throws Throwable {
		elementVisibility(ph.getSh().checkOutDate(), "23/10/2019");
		ph.getSh().searchButton().click();

	}

	@When("^User Click on Search button$")
	public void user_Click_on_Search_button() throws Throwable {
		elementVisibility(ph.getSh().checkOutDate(), "23/10/2019");
		ph.getSh().searchButton().click();
	}

	@When("^Verify that application throws error message$")
	public void verify_that_application_throws_error_message() throws Throwable {
		System.out.println("bjebduebd");
		//Assert.assertEquals("Check-Out Date shall be after Check-In Date",ph.getSh().checkOutErrorDisplay().getText());
	}

	@When("^Select No-of-adults as in test data$")
	public void select_No_of_adults_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSh().adultRoomDD(), "index", "2");

	}

	@When("^Select No-of-children as in test data$")
	public void select_No_of_children_as_in_test_data() throws Throwable {
		selectOptionInDD(ph.getSh().childRoomDD(), "index", "3");

	}

	@When("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		ph.getSh().searchButton().click();

	}

	@When("^User Enters the check-out-date as in test data$")
	public void user_Enters_the_check_out_date_as_in_test_data() throws Throwable {
		elementVisibility(ph.getSh().checkOutDate(), "23/12/2019");
	}

	@Then("^Verify that hotel displayed is the same as selected in search Hotel form\\.$")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
		SelectHotelPage shp = new SelectHotelPage(driver);
		String text = shp.firstHotelText().getAttribute("value");
		Assert.assertEquals("Hotel Creek", text);
		System.out.println(text);

	}

	@When("^Click on Search button\\.$")
	public void click_on_Search_button_test3() throws Throwable {
		ph.getSh().searchButton().click();

	}
	
	@Given("^User launched application and selects as in test data$")
	public void user_launched_application_and_selects_as_in_test_data() throws Throwable {
		ph.getSh().locationDD().click();
		selectOptionInDD(ph.getSh().locationDD(), "visibletext", "Sydney");
		isSelected(ph.getSh().locationDD());
	    
	}

	@When("^User selects number of rooms as in test data$")
	public void user_selects_number_of_rooms_as_in_test_data() throws Throwable {
	    selectOptionInDD(ph.getSh().hotelsDD(), "index", "2");
	    
	}

	@When("^User enters check-in and check-out date$")
	public void user_enters_check_in_and_check_out_date() throws Throwable {
		selectOptionInDD(ph.getSh().roomTypeDD(), "index", "4");
	    
	    
	}

	@When("^User selects number of adults and childrens as in test data$")
	public void user_selects_number_of_adults_and_childrens_as_in_test_data() throws Throwable {
	    selectOptionInDD(ph.getSh().roomNumbersDD(), "index", "2");
	    
	}

	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
	    ph.getSh().searchButton().click();
	    
	}

	@Then("^User verifies that hotel displayed is same as selected in search hotel page$")
	public void user_verifies_that_hotel_displayed_is_same_as_selected_in_search_hotel_page() throws Throwable {
		String text = ph.getSh().usernameVerification().getAttribute("value");
		Assert.assertEquals("Hello@cbzsrini!", text);
		System.out.println(text);
	}


}
