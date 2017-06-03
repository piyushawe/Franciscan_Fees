$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ReportsFeature/ClassWiseMarkList.feature");
formatter.feature({
  "line": 1,
  "name": "Class Wise Mark List",
  "description": "  As a user I would like to open class wise mark list \n  So that I don\u0027t have to do it myself",
  "id": "class-wise-mark-list",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "To test class wise mark list without surname wise",
  "description": "",
  "id": "class-wise-mark-list;to-test-class-wise-mark-list-without-surname-wise",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "class wise mark list is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user select class \"\u003cclass\u003e\" on class wise mark list",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user select section \"\u003csection\u003e\" on class wise mark list",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user click surname wise on class wise mark list",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user click show on class wise mark list",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "class-wise-mark-list;to-test-class-wise-mark-list-without-surname-wise;",
  "rows": [
    {
      "cells": [
        "class",
        "section"
      ],
      "line": 32,
      "id": "class-wise-mark-list;to-test-class-wise-mark-list-without-surname-wise;;1"
    },
    {
      "cells": [
        "1",
        "A"
      ],
      "line": 33,
      "id": "class-wise-mark-list;to-test-class-wise-mark-list-without-surname-wise;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14896312054,
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
  "name": "user enters url\" http://192.168.10.101:8069/Modules.aspx\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter username\"admin\" and password\"admin@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "passes school name \"rosary\"",
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
      "val": " http://192.168.10.101:8069/Modules.aspx",
      "offset": 16
    }
  ],
  "location": "MyTestSteps.user_enters_url(String)"
});
formatter.result({
  "duration": 9334648237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 15
    },
    {
      "val": "admin@123",
      "offset": 35
    }
  ],
  "location": "MyTestSteps.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 241857216,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 7880475149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rosary",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.passes_school_name(String)"
});
formatter.result({
  "duration": 87680,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 746509524,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "To test class wise mark list without surname wise",
  "description": "",
  "id": "class-wise-mark-list;to-test-class-wise-mark-list-without-surname-wise;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "class wise mark list is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user select class \"1\" on class wise mark list",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user select section \"A\" on class wise mark list",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user click surname wise on class wise mark list",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user click show on class wise mark list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.class_wise_mark_list_is_opened()"
});
