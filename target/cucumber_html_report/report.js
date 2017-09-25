$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureVerifyPage/VerifyPage.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan Fee",
  "description": "    As a user I would like to verify that \n    The page is loaded successfully",
  "id": "franciscan-fee",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4367350062,
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
  "name": "user enter url \"http://erp.stkarenssecondaryschool.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username \"admin\" and password \"stkss#54321techpass\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "passes school name \"st karen\"",
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
      "val": "http://erp.stkarenssecondaryschool.com",
      "offset": 16
    }
  ],
  "location": "MyStepDefs.user_enter_url(String)"
});
formatter.result({
  "duration": 3548034045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    },
    {
      "val": "stkss#54321techpass",
      "offset": 42
    }
  ],
  "location": "MyStepDefs.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 175453459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "st karen",
      "offset": 20
    }
  ],
  "location": "MyStepDefs.passes_school_name(String)"
});
formatter.result({
  "duration": 59821,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_signin()"
});
formatter.result({
  "duration": 2118427060,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.fee_manager_home_page_is_opened()"
});
formatter.result({
  "duration": 66305688,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@src\u003d\u0027images/big/Fee-Manager.png\u0027]\"}\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 62 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.10.111\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\dell\\AppData\\Local\\Temp\\scoped_dir1656_10880}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: d8acd0e17639ff2863618d1103aa3c00\n*** Element info: {Using\u003dxpath, value\u003d//img[@src\u003d\u0027images/big/Fee-Manager.png\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat stepDefs.MyStepDefs.fee_manager_home_page_is_opened(MyStepDefs.java:150)\r\n\tat ✽.Then fee manager home page is opened(FeatureVerifyPage/VerifyPage.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 527,
      "value": "#tc form"
    }
  ],
  "line": 529,
  "name": "To verify tc form page",
  "description": "",
  "id": "franciscan-fee;to-verify-tc-form-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 528,
      "name": "@scenario86"
    }
  ]
});
formatter.step({
  "line": 530,
  "name": "user open tc form page",
  "keyword": "When "
});
formatter.step({
  "line": 531,
  "name": "verify tc form page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_open_tc_form_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDefs.verify_tc_form_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3297764484,
  "status": "passed"
});
});