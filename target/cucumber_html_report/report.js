$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureVerifyPage/VerifySaveView.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan Fee",
  "description": "As a user I would like to verify that\r\nThere are no errors on clicking save or view buttons",
  "id": "franciscan-fee",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5417025011,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user enter url \"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click signin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "fee manager home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyStepDefs.user_enter_url(String)"
});
formatter.result({
  "duration": 6785325863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "Admin#franciscan",
      "offset": 42
    }
  ],
  "location": "MyStepDefs.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 141019303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyStepDefs.passes_school_name(String)"
});
formatter.result({
  "duration": 55423,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_signin()"
});
formatter.result({
  "duration": 4193235108,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.fee_manager_home_page_is_opened()"
});
formatter.result({
  "duration": 385288739,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 735,
      "value": "#student fee details"
    }
  ],
  "line": 737,
  "name": "To verify the view button on student fee details",
  "description": "",
  "id": "franciscan-fee;to-verify-the-view-button-on-student-fee-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 736,
      "name": "@scenario97"
    }
  ]
});
formatter.step({
  "line": 738,
  "name": "user open student fee details page",
  "keyword": "When "
});
formatter.step({
  "line": 739,
  "name": "click view on student fee details page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_open_student_fee_details_page()"
});
formatter.result({
  "duration": 1640375633,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_view_on_student_fee_details_page()"
});
formatter.result({
  "duration": 109624637258,
  "status": "passed"
});
formatter.after({
  "duration": 3328857559,
  "status": "passed"
});
});