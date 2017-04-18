$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/ActiveInactiveStudentsDetailReport.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan ERP",
  "description": "",
  "id": "franciscan-erp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4089463001,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Active Inactive Students Detail Report",
  "description": "",
  "id": "franciscan-erp;active-inactive-students-detail-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user enters url\"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "enter username\"admin\" and password\"Admin@987\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "home page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "active inactive students detail report is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user select user \"eCare Admin\" on active inactive students detail report is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user select from date as month \"October\" year \"2016\" and day\"1\" on active inactive students detail report page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user select till date as month \"November\" year \"2016\" and day\"30\" on active inactive students detail report page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user click inactive on active inactive students detail report page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user click show on active inactive students detail report page",
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
  "duration": 2835254664,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 15
    },
    {
      "val": "Admin@987",
      "offset": 35
    }
  ],
  "location": "MyTestSteps.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 172825951,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 2951752658,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 349514800,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.active_inactive_students_detail_report_is_opened()"
});
formatter.result({
  "duration": 4611063898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eCare Admin",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.user_select_user_on_active_inactive_students_detail_report_is_opened(String)"
});
formatter.result({
  "duration": 85454069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "October",
      "offset": 32
    },
    {
      "val": "2016",
      "offset": 47
    },
    {
      "val": "1",
      "offset": 61
    }
  ],
  "location": "MyTestSteps.user_select_from_date_as_month_year_and_day_on_active_inactive_students_detail_report_page(String,String,String)"
});
formatter.result({
  "duration": 4720808495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "November",
      "offset": 32
    },
    {
      "val": "2016",
      "offset": 48
    },
    {
      "val": "30",
      "offset": 62
    }
  ],
  "location": "MyTestSteps.user_select_till_date_as_month_year_and_day_on_active_inactive_students_detail_report_page(String,String,String)"
});
formatter.result({
  "duration": 5113962024,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_inactive_on_active_inactive_students_detail_report_page()"
});
formatter.result({
  "duration": 135681978,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_show_on_active_inactive_students_detail_report_page()"
});
formatter.result({
  "duration": 5157203701,
  "status": "passed"
});
formatter.after({
  "duration": 27565,
  "status": "passed"
});
formatter.uri("Feature/AdvancePaymentReport.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan ERP",
  "description": "",
  "id": "franciscan-erp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4201588148,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Advance Payment Report",
  "description": "",
  "id": "franciscan-erp;advance-payment-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enters url\"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "enter username\"admin\" and password\"Admin@987\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "home page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "advance payment report is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user select installment\"JANUARY - MARCH\" on advance payment report",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user select class\"1\" on advance payment report",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user select section\"A\" on advance payment report",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user select fee type\"SCHOOL FEE\" on advance payment report",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user click on show on advance payment report",
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
  "duration": 7956940133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 15
    },
    {
      "val": "Admin@987",
      "offset": 35
    }
  ],
  "location": "MyTestSteps.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 135683152,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 2159983649,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 619307559,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.advance_payment_report_is_opened()"
});
formatter.result({
  "duration": 5415632690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JANUARY - MARCH",
      "offset": 24
    }
  ],
  "location": "MyTestSteps.user_select_installment_on_advance_payment_report(String)"
});
formatter.result({
  "duration": 88244868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.user_select_class_on_advance_payment_report(String)"
});
formatter.result({
  "duration": 236652145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.user_select_section_on_advance_payment_report(String)"
});
formatter.result({
  "duration": 95119373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SCHOOL FEE",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.user_select_fee_type_on_advance_payment_report(String)"
});
formatter.result({
  "duration": 83639479,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_advance_payment_report()"
});
formatter.result({
  "duration": 2751203471,
  "status": "passed"
});
formatter.after({
  "duration": 24632,
  "status": "passed"
});
});