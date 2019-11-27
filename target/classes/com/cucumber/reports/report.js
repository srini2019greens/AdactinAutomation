$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/feature/TC_101.feature");
formatter.feature({
  "line": 1,
  "name": "Task in adactin hotel application",
  "description": "",
  "id": "task-in-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Launch hotel reservation application using URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login to the application using username and password",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.launch_hotel_reservation_application()"
});
formatter.result({
  "duration": 4183952000,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.login_to_the_application_using_username_and_password()"
});
formatter.result({
  "duration": 11190574200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "To verify valid login details",
  "description": "",
  "id": "task-in-adactin-hotel-application;to-verify-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@TC_101"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User verifies the username in the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_101.user_verifies_the_username_in_the_HomePage()"
});
formatter.result({
  "duration": 95625800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch hotel reservation application using URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login to the application using username and password",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.launch_hotel_reservation_application()"
});
formatter.result({
  "duration": 969581800,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.login_to_the_application_using_username_and_password()"
});
formatter.result({
  "duration": 2334021701,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "To verify whether the check-out date field accepts a later date than checkin date",
  "description": "",
  "id": "task-in-adactin-hotel-application;to-verify-whether-the-check-out-date-field-accepts-a-later-date-than-checkin-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC_102"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Select location as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select hotel as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select room type as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select no-of-rooms as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Enter check-in-date later than the checkout-date field as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.select_location_as_in_test_data()"
});
formatter.result({
  "duration": 1389492600,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_hotel_as_in_test_data()"
});
formatter.result({
  "duration": 303364900,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_room_type_as_in_test_data()"
});
formatter.result({
  "duration": 339482001,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_no_of_rooms_as_in_test_data()"
});
formatter.result({
  "duration": 208498000,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.enter_check_in_date_later_than_the_checkout_date_field_as_in_test_data()"
});
formatter.result({
  "duration": 828935700,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()"
});
formatter.result({
  "duration": 129967700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch hotel reservation application using URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login to the application using username and password",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.launch_hotel_reservation_application()"
});
formatter.result({
  "duration": 791341200,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.login_to_the_application_using_username_and_password()"
});
formatter.result({
  "duration": 2238619701,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "To check if error is reported if check-out date field is in the past",
  "description": "",
  "id": "task-in-adactin-hotel-application;to-check-if-error-is-reported-if-check-out-date-field-is-in-the-past",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@TC_103"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Select location as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select hotel as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select room type as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Select no-of-rooms as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Enter check-out-date as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify that application throws error message",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.select_location_as_in_test_data()"
});
formatter.result({
  "duration": 415604400,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_hotel_as_in_test_data()"
});
formatter.result({
  "duration": 348833400,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_room_type_as_in_test_data()"
});
formatter.result({
  "duration": 362518000,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_no_of_rooms_as_in_test_data()"
});
formatter.result({
  "duration": 300972900,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.enter_check_out_date_as_in_test_data()"
});
formatter.result({
  "duration": 478165899,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.user_Click_on_Search_button()"
});
formatter.result({
  "duration": 331236000,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.verify_that_application_throws_error_message()"
});
formatter.result({
  "duration": 45980600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch hotel reservation application using URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Login to the application using username and password",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.launch_hotel_reservation_application()"
});
formatter.result({
  "duration": 1133238500,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.login_to_the_application_using_username_and_password()"
});
formatter.result({
  "duration": 2454815700,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel",
  "description": "",
  "id": "task-in-adactin-hotel-application;to-verify-whether-locations-in-select-hotel-page-are-displayed-according-to-the-location-selected-in-search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC_104"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Select location as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Select hotel as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Select room type as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Select no-of-rooms as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User Enters the check-out-date as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Select No-of-adults as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Select No-of-children as in test data",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on Search button.",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Verify that hotel displayed is the same as selected in search Hotel form.",
  "keyword": "And "
});
formatter.match({
  "location": "TC_101.select_location_as_in_test_data()"
});
formatter.result({
  "duration": 350642100,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_hotel_as_in_test_data()"
});
formatter.result({
  "duration": 217730799,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_room_type_as_in_test_data()"
});
formatter.result({
  "duration": 250936500,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_no_of_rooms_as_in_test_data()"
});
formatter.result({
  "duration": 306902201,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.user_Enters_the_check_out_date_as_in_test_data()"
});
formatter.result({
  "duration": 398249600,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_No_of_adults_as_in_test_data()"
});
formatter.result({
  "duration": 310955301,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.select_No_of_children_as_in_test_data()"
});
formatter.result({
  "duration": 426351400,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.click_on_Search_button_test3()"
});
formatter.result({
  "duration": 1707248201,
  "status": "passed"
});
formatter.match({
  "location": "TC_101.verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form()"
});
formatter.result({
  "duration": 47441200,
  "status": "passed"
});
});