$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Feature01.feature");
formatter.feature({
  "name": "Login to hris",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "step.user_is_on_login_page()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat Step_defs.step.user_is_on_login_page(step.java:25)\n\tat ✽.User is on login page(file:src/test/resources/Features/Feature01.feature:4)\n",
  "status": "pending"
});
formatter.step({
  "name": "User enters correct Username",
  "keyword": "When "
});
formatter.match({
  "location": "step.user_enters_correct_Username()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters correct password",
  "keyword": "And "
});
formatter.match({
  "location": "step.user_enters_correct_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "step.user_click_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User redirected to timesheet",
  "keyword": "And "
});
formatter.match({
  "location": "step.user_redirected_to_timesheet()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies the home page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Feature02.feature");
formatter.feature({
  "name": "login to hris",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with incorrect credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User Enters incorrect username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User Enter incorrect password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User  clicks SignIn button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a Invlaid login msg is shown",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Qaitupdates is shown",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
