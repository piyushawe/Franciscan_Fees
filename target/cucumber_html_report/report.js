$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/FeeEntry.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan ERP",
  "description": "",
  "id": "franciscan-erp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17865760517,
  "status": "passed"
});
formatter.scenario({
  "line": 1323,
  "name": "To test when one head fee is left with partial late fee payment, paid remaining head fee and waive off late fee and then the receipts are cancelled(R2,R1)",
  "description": "",
  "id": "franciscan-erp;to-test-when-one-head-fee-is-left-with-partial-late-fee-payment,-paid-remaining-head-fee-and-waive-off-late-fee-and-then-the-receipts-are-cancelled(r2,r1)",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 1322,
      "name": "@scenario60"
    }
  ]
});
formatter.step({
  "line": 1324,
  "name": "user enters url\"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 1325,
  "name": "enter username\"admin\" and password\"Admin@987\"",
  "keyword": "When "
});
formatter.step({
  "line": 1326,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 1327,
  "name": "home page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1328,
  "name": "fee entry form is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1329,
  "name": "user searches a student on fee entry form by class\"1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1330,
  "name": "user selects bank name\"Axsis Bank For Juniors\" on fee entry",
  "keyword": "Then "
});
formatter.step({
  "line": 1331,
  "name": "select entry mode\"School\" on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1332,
  "name": "selects pay mode\"Cheque\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1333,
  "name": "click on show of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1334,
  "name": "make head \"TUITION FEE\" amount as zero",
  "keyword": "Then "
});
formatter.step({
  "line": 1335,
  "name": "partial late fee is paid on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1336,
  "name": "click on save of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1337,
  "name": "user searches a student on fee entry form by class\"1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1338,
  "name": "user selects bank name\"Axsis Bank For Juniors\" on fee entry",
  "keyword": "Then "
});
formatter.step({
  "line": 1339,
  "name": "select entry mode\"School\" on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1340,
  "name": "selects pay mode\"Cheque\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1341,
  "name": "click on show of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1342,
  "name": "waive off late fine on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1343,
  "name": "click on save of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1344,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1345,
  "name": "cancel the receipt of the fee",
  "keyword": "Then "
});
formatter.step({
  "line": 1346,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1347,
  "name": "fee entry form is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1348,
  "name": "user searches a student on fee entry form by class\"1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1349,
  "name": "user verify late fine on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1350,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1351,
  "name": "cancel the receipt of the fee by class\"1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1352,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1353,
  "name": "fee entry form is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1354,
  "name": "user searches a student on fee entry form by class\"1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1355,
  "name": "user verify late fine on fee entry form",
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
  "duration": 11671271312,
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
  "duration": 1395006667,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 16974851522,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 3850631374,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.fee_entry_form_is_opened()"
});
formatter.result({
  "duration": 5038942180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 62
    },
    {
      "val": "sonia1",
      "offset": 85
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "duration": 2483011824,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.13 seconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.111\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir5320_11252}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 37614dd97999909b75820906ae16d099\n*** Element info: {Using\u003did, value\u003dContentPlaceHolder1_ddlSection}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat pageObjects.FeeEntry.searchStudent(FeeEntry.java:80)\r\n\tat step_Def.MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(MyTestSteps.java:325)\r\n\tat ✽.Then user searches a student on fee entry form by class\"1\" section\"A\" and student details\"sonia1\"(Feature/FeeEntry.feature:1329)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Axsis Bank For Juniors",
      "offset": 23
    }
  ],
  "location": "MyTestSteps.user_selects_bank_name_on_fee_entry(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "School",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.select_entry_mode_on_fee_entry_form(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cheque",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.selects_pay_mode_on_fee_entry_form(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_on_show_of_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TUITION FEE",
      "offset": 11
    }
  ],
  "location": "MyTestSteps.make_head_amount_as_zero(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.partial_late_fee_is_paid_on_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_on_save_of_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 62
    },
    {
      "val": "sonia1",
      "offset": 85
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Axsis Bank For Juniors",
      "offset": 23
    }
  ],
  "location": "MyTestSteps.user_selects_bank_name_on_fee_entry(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "School",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.select_entry_mode_on_fee_entry_form(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cheque",
      "offset": 17
    }
  ],
  "location": "MyTestSteps.selects_pay_mode_on_fee_entry_form(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_on_show_of_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.waive_off_late_fine_on_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.click_on_save_of_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.cancel_the_receipt_of_the_fee()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.fee_entry_form_is_opened()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 62
    },
    {
      "val": "sonia1",
      "offset": 85
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.user_verify_late_fine_on_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 39
    },
    {
      "val": "A",
      "offset": 50
    },
    {
      "val": "sonia1",
      "offset": 73
    }
  ],
  "location": "MyTestSteps.cancel_the_receipt_of_the_fee_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.fee_entry_form_is_opened()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 62
    },
    {
      "val": "sonia1",
      "offset": 85
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.user_verify_late_fine_on_fee_entry_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 29911,
  "status": "passed"
});
});