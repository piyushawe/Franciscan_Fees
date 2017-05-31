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
  "name": "user select section \"\u003csection\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;",
  "rows": [
    {
      "cells": [
        "class",
        "section",
        "session"
      ],
      "line": 21,
      "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;;1"
    },
    {
      "cells": [
        "1",
        "A",
        "2017-2018"
      ],
      "line": 22,
      "id": "yearly-collection-report;to-test-yearly-collection-report-with-filters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4201275209,
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
  "duration": 1184185423,
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
  "duration": 169627229,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 485245770,
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
  "duration": 267441,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 290377106,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
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
    2
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
  "name": "user select section \"A\" on yearly collection report",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_opens_yearly_collection_report_page()"
});
formatter.result({
  "duration": 505746007,
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
  "duration": 84991761,
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
  "duration": 100825868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.user_select_section_on_yearly_collection_report(String)"
});
formatter.result({
  "duration": 90912104,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_yearly_collection_report()"
});
formatter.result({
  "duration": 9745520302,
  "status": "passed"
});
formatter.after({
  "duration": 2794031097,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "To test yearly collection report when filter with clearing date is selected",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-when-filter-with-clearing-date-is-selected",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user select entry mode \"School\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user select session\"\u003csession\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user select class\"\u003cclass\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user select section \"\u003csection\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user select fee type\"\u003cfee type\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user select school\"\u003cschool\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user select pay mode as \"Cash\" and \"Cheque\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Then user select bank name \"\u003cbank name\u003e\" on yearly collection report"
    }
  ],
  "line": 35,
  "name": "user checks on filter with clearing date",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-when-filter-with-clearing-date-is-selected;",
  "rows": [
    {
      "cells": [
        "class",
        "section",
        "school",
        "fee type",
        "installment",
        "session",
        "bank name"
      ],
      "line": 39,
      "id": "yearly-collection-report;to-test-yearly-collection-report-when-filter-with-clearing-date-is-selected;;1"
    },
    {
      "cells": [
        "1",
        "A",
        "Delhi Public School",
        "SCHOOL",
        "APRIL-JUNE",
        "2017-2018",
        "Axsis Bank For Juniors"
      ],
      "line": 40,
      "id": "yearly-collection-report;to-test-yearly-collection-report-when-filter-with-clearing-date-is-selected;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3703969699,
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
  "duration": 935922832,
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
  "duration": 206529004,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 1097001648,
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
  "duration": 78883,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 105456515,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cimg src\u003d\"images/big/Fee-Manager.png\"\u003e is not clickable at point (287, 347). Other element would receive the click: \u003cdiv class\u003d\"container-in\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 62 milliseconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.111\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir6608_12307}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 7a54c2d4fb2c3b23a0d71bce5dcd2b63\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat step_Def.MyTestSteps.home_page_is_opened(MyTestSteps.java:184)\r\n\tat ✽.Then home page is opened(ReportsFeature/YearlyCollectionReport.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 40,
  "name": "To test yearly collection report when filter with clearing date is selected",
  "description": "",
  "id": "yearly-collection-report;to-test-yearly-collection-report-when-filter-with-clearing-date-is-selected;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user select entry mode \"School\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user select session\"2017-2018\" on yearly collection report",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user select class\"1\" on yearly collection report",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user select section \"A\" on yearly collection report",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user select fee type\"SCHOOL\" on yearly collection report",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user select school\"Delhi Public School\" on yearly collection report",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user select pay mode as \"Cash\" and \"Cheque\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Then user select bank name \"\u003cbank name\u003e\" on yearly collection report"
    }
  ],
  "line": 35,
  "name": "user checks on filter with clearing date",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_opens_yearly_collection_report_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "School",
      "offset": 24
    }
  ],
  "location": "MyTestSteps.user_select_entry_mode_on_yearly_collection_report(String)"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.user_select_section_on_yearly_collection_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SCHOOL",
      "offset": 21
    }
  ],
  "location": "MyTestSteps.user_select_fee_type_on_yearly_collection_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi Public School",
      "offset": 19
    }
  ],
  "location": "MyTestSteps.user_select_school_on_yearly_collection_report(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cash",
      "offset": 25
    },
    {
      "val": "Cheque",
      "offset": 36
    }
  ],
  "location": "MyTestSteps.user_select_pay_mode_as_and_on_yearly_collection_report(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.user_checks_on_filter_with_clearing_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_yearly_collection_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2844597251,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 42,
      "value": "#yearly collection report"
    }
  ],
  "line": 44,
  "name": "To test with no filters",
  "description": "",
  "id": "yearly-collection-report;to-test-with-no-filters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user select session\"\u003csession\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "yearly-collection-report;to-test-with-no-filters;",
  "rows": [
    {
      "cells": [
        "session"
      ],
      "line": 50,
      "id": "yearly-collection-report;to-test-with-no-filters;;1"
    },
    {
      "cells": [
        "2017-2018"
      ],
      "line": 51,
      "id": "yearly-collection-report;to-test-with-no-filters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3512716169,
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
  "duration": 1169877954,
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
  "duration": 225928101,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 541256624,
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
  "duration": 73898,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 478817820,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "To test with no filters",
  "description": "",
  "id": "yearly-collection-report;to-test-with-no-filters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user select session\"2017-2018\" on yearly collection report",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_opens_yearly_collection_report_page()"
});
formatter.result({
  "duration": 763128841,
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
  "duration": 120638150,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_yearly_collection_report()"
});
formatter.result({
  "duration": 8627104370,
  "status": "passed"
});
formatter.after({
  "duration": 2841341343,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 54,
  "name": "To test with cheque clearing date",
  "description": "",
  "id": "yearly-collection-report;to-test-with-cheque-clearing-date",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "user select session\"\u003csession\u003e\" on yearly collection report",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user checks on filter with clearing date",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.examples({
  "line": 60,
  "name": "",
  "description": "",
  "id": "yearly-collection-report;to-test-with-cheque-clearing-date;",
  "rows": [
    {
      "cells": [
        "session"
      ],
      "line": 61,
      "id": "yearly-collection-report;to-test-with-cheque-clearing-date;;1"
    },
    {
      "cells": [
        "2017-2018"
      ],
      "line": 62,
      "id": "yearly-collection-report;to-test-with-cheque-clearing-date;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4298632858,
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
  "duration": 1681381259,
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
  "duration": 200378757,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 396368207,
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
  "duration": 86507,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 323412432,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "To test with cheque clearing date",
  "description": "",
  "id": "yearly-collection-report;to-test-with-cheque-clearing-date;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@scenario4"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "user opens yearly collection report page",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "user select session\"2017-2018\" on yearly collection report",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user checks on filter with clearing date",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user click on show on yearly collection report",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestSteps.user_opens_yearly_collection_report_page()"
});
formatter.result({
  "duration": 541941059,
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
  "duration": 61777827,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_checks_on_filter_with_clearing_date()"
});
formatter.result({
  "duration": 113944518,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_click_on_show_on_yearly_collection_report()"
});
formatter.result({
  "duration": 8232388310,
  "status": "passed"
});
formatter.after({
  "duration": 2672002081,
  "status": "passed"
});
});