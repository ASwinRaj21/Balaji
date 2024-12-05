$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "user logins facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user logins facebook",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fb.stepdefinitions.Login.user_launches_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user enters credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters username",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fb.stepdefinitions.Login.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password",
  "keyword": "When "
});
formatter.match({
  "location": "com.fb.stepdefinitions.Login.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fb.stepdefinitions.Login.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
});