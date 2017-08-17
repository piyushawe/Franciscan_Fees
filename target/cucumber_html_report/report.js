$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ReportsFeature/YearlyCollectionReport.feature");
formatter.feature({
  "line": 1,
  "name": "Yearly Collection Report",
  "description": "    As a user I would like to open yearly collection report\n    So that I don\u0027t have to do it myself",
  "id": "yearly-collection-report",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "To test yearly collection report with filters",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user select session\"\u003csession\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user select class\"\u003cclass\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;",
  "rows": [
    {
      "cells": [
        "class",
        "session"
      ],
      "line": 20,
      "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;;1"
    },
    {
      "cells": [
        "1",
        "2017-2018"
      ],
      "line": 21,
      "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4151813030,
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
  "name": "user enters url\"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter username\"admin\" and password\"Admin#franciscan\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "passes school name \"qaerp\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "home page is opened",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://qaerp.franciscanecare.net",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enters_url(String)"
});
formatter.result({
  "duration": 1076625979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 15
    },
    {
      "val": "Admin#franciscan",
      "offset": 35
    }
  ],
  "location": "MyTestSteps.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 167466185,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 721378522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaerp",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 113778,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 312319748,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "To test yearly collection report with filters",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user select session\"2017-2018\" on yearly collection report",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user select class\"1\" on yearly collection report",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_opens_yearly_collection_report_page()"
});
formatter.result({
  "duration": 1148915524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017-2018",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.user_select_session_on_yearly_collection_report(String)"
});
formatter.result({
  "duration": 58342168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.user_select_class_on_yearly_collection_report(String)"
});
formatter.result({
  "duration": 1764052871,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_yearly_collection_report()"
});
formatter.result({
  "duration": 5803871649,
  "status": "passed"
});
formatter.after({
  "duration": 3099562633,
  "status": "passed"
});
});