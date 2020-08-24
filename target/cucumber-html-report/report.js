$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bhupe/AIGLIFE.co.uk/src/test/Resources/insurance.feature");
formatter.feature({
  "line": 1,
  "name": "Instant insurance quote",
  "description": "",
  "id": "instant-insurance-quote",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8481014400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "instant-insurance-quote;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigate to personal insurance page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "U should find and select the right insurance",
  "keyword": "Then "
});
formatter.match({
  "location": "SepDefAcc.user_is_on_homepage()"
});
formatter.result({
  "duration": 151755900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefInsurance.user_navigate_to_personal_insurance_page()"
});
formatter.result({
  "duration": 2376879300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefInsurance.u_should_find_and_select_the_right_insurance()"
});
formatter.result({
  "duration": 568112200,
  "status": "passed"
});
});