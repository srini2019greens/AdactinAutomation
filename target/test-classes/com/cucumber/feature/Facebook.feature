Feature: Facebook Test scenarios 

Scenario: Verify the successful login of the application
Given User launch the browser and hit the facebook application
When User enter the user name or email id
And User enter the password
And User click on the login button
Then User Verify the user name in the header
And User logout the application

Scenario: Verify the successful login of the application with step data
Given User launch the browser and hit the facebook application
When User enter the user name or email id "testsathya@gmail.com"
And User enter the password "9876543"
And User click on the login button
Then User verify the user name "Sathya" in the header
And User logout the application

Scenario Outline: Verify the successful login of the application with examples
Given User launch the browser and hit the facebook application
When User enter the user name or email id "<Username>"
And User enter the password "<Password>"
And User click on the login button
And User verify the user name "<Message>" in the header
And User logout the application

Examples:
|Username						|Password	|Message								|
|Kavi@gmail.com			|12345		|Logged in Successfully	|
|Srini@com					|56778		|Invalid credentials		|
|Ajith@gmail				|12345		|Invalid credentials		|