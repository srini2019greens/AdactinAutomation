Feature: Task in adactin hotel application

  Background: Launch hotel reservation application using URL
    When Launch hotel reservation application
    And Login to the application using username and password

  @TC_101
  Scenario: To verify valid login details
    Then User verifies the username in the HomePage

  @TC_102
  Scenario: To verify whether the check-out date field accepts a later date than checkin date
    Given Select location as in test data
    When Select hotel as in test data
    And Select room type as in test data
    And Select no-of-rooms as in test data
    And Enter check-in-date later than the checkout-date field as in test data
    Then Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’

  @TC_103
  Scenario: To check if error is reported if check-out date field is in the past
    Given Select location as in test data
    When Select hotel as in test data
    And Select room type as in test data
    And Select no-of-rooms as in test data
    And Enter check-out-date as in test data
    And User Click on Search button
    Then Verify that application throws error message

  @TC_104
  Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
    Given Select location as in test data
    When Select hotel as in test data
    And Select room type as in test data
    And Select no-of-rooms as in test data
    And User Enters the check-out-date as in test data
    And Select No-of-adults as in test data
    And Select No-of-children as in test data
    And Click on Search button.
    Then Verify that hotel displayed is the same as selected in search Hotel form.
