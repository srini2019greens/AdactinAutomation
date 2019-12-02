$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Task in adactin hotel application",
  "description": "",
  "id": "task-in-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 295400,
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
  "location": "AdactinStepDefinition.launch_hotel_reservation_application()"
});
formatter.result({
  "duration": 3598240100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.login_to_the_application_using_username_and_password()"
});
formatter.result({
  "duration": 8024706300,
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
  "location": "AdactinStepDefinition.user_verifies_the_username_in_the_HomePage()"
});
formatter.result({
  "duration": 118793000,
  "status": "passed"
});
formatter.after({
  "duration": 342200,
  "status": "passed"
});
});