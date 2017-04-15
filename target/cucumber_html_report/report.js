$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/FeeEntry.feature");
formatter.feature({
  "line": 1,
  "name": "Franciscan ERP",
  "description": "",
  "id": "franciscan-erp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4118057303,
  "status": "passed"
});
formatter.scenario({
  "line": 1791,
  "name": "",
  "description": "",
  "id": "franciscan-erp;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 1790,
      "name": "@scenario72"
    }
  ]
});
formatter.step({
  "line": 1792,
  "name": "user enters url\"http://qaerp.franciscanecare.net\"",
  "keyword": "Given "
});
formatter.step({
  "line": 1793,
  "name": "enter username\"admin\" and password\"Admin@987\"",
  "keyword": "When "
});
formatter.step({
  "line": 1794,
  "name": "signin",
  "keyword": "Then "
});
formatter.step({
  "line": 1795,
  "name": "home page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1796,
  "name": "fee entry form is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1797,
  "name": "user searches a student on fee entry form by class\"test1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1798,
  "name": "user selects the date as month\"September\" year\"2016\" and day\"25\" on fee entry page",
  "keyword": "Then "
});
formatter.step({
  "line": 1799,
  "name": "user selects bank name\"Axsis Bank For Juniors\" on fee entry",
  "keyword": "Then "
});
formatter.step({
  "line": 1800,
  "name": "select entry mode\"Bank\" on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1801,
  "name": "selects pay mode\"Cheque\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1802,
  "name": "user selects installment\"JULY - AUGUST\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1803,
  "name": "impose manual late fine\"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1804,
  "name": "give discount of rs\"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1805,
  "name": "click on show of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1806,
  "name": "partial late fee is paid on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1807,
  "name": "click on save of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1808,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1809,
  "name": "bounce the cheque of the fee",
  "keyword": "Then "
});
formatter.step({
  "line": 1810,
  "name": "go back to the default page",
  "keyword": "Then "
});
formatter.step({
  "line": 1811,
  "name": "fee entry form is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 1812,
  "name": "user searches a student on fee entry form by class\"test1\" section\"A\" and student details\"sonia1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 1813,
  "name": "user selects the date as month\"September\" year\"2016\" and day\"25\" on fee entry page",
  "keyword": "Then "
});
formatter.step({
  "line": 1814,
  "name": "user selects bank name\"Axsis Bank For Juniors\" on fee entry",
  "keyword": "Then "
});
formatter.step({
  "line": 1815,
  "name": "select entry mode\"Bank\" on fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1816,
  "name": "selects pay mode\"Cheque\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1817,
  "name": "user selects installment\"JULY - AUGUST\" on fee entry form",
  "keyword": "And "
});
formatter.step({
  "line": 1818,
  "name": "click on show of fee entry form",
  "keyword": "Then "
});
formatter.step({
  "line": 1819,
  "name": "user verify fee details on fee entry form",
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
  "duration": 1095127041,
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
  "duration": 143313844,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.signin()"
});
formatter.result({
  "duration": 1170669698,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.home_page_is_opened()"
});
formatter.result({
  "duration": 382947048,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.fee_entry_form_is_opened()"
});
formatter.result({
  "duration": 987091830,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 66
    },
    {
      "val": "sonia1",
      "offset": 89
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "duration": 3846848805,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "September",
      "offset": 31
    },
    {
      "val": "2016",
      "offset": 47
    },
    {
      "val": "25",
      "offset": 61
    }
  ],
  "location": "MyTestSteps.user_selects_the_date_as_month_year_and_day_on_fee_entry_page(String,String,String)"
});
formatter.result({
  "duration": 2959843890,
  "status": "passed"
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
  "duration": 127320782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.select_entry_mode_on_fee_entry_form(String)"
});
formatter.result({
  "duration": 93383137,
  "status": "passed"
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
  "duration": 458378858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JULY - AUGUST",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_selects_installment_on_fee_entry_form(String)"
});
formatter.result({
  "duration": 500076829,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 24
    }
  ],
  "location": "MyTestSteps.impose_manual_late_fine(String)"
});
formatter.result({
  "duration": 175500254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 20
    }
  ],
  "location": "MyTestSteps.give_discount_of_rs(String)"
});
formatter.result({
  "duration": 588569295,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_on_show_of_fee_entry_form()"
});
formatter.result({
  "duration": 750429158,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.partial_late_fee_is_paid_on_fee_entry_form()"
});
formatter.result({
  "duration": 22264156936,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_on_save_of_fee_entry_form()"
});
formatter.result({
  "duration": 26964775615,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "duration": 1003509214,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.bounce_the_cheque_of_the_fee()"
});
formatter.result({
  "duration": 4282627884,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.go_back_to_the_default_page()"
});
formatter.result({
  "duration": 1002349446,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.fee_entry_form_is_opened()"
});
formatter.result({
  "duration": 155490964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 51
    },
    {
      "val": "A",
      "offset": 66
    },
    {
      "val": "sonia1",
      "offset": 89
    }
  ],
  "location": "MyTestSteps.user_searches_a_student_on_fee_entry_form_by_class_section_and_student_details(String,String,String)"
});
formatter.result({
  "duration": 5914635827,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "September",
      "offset": 31
    },
    {
      "val": "2016",
      "offset": 47
    },
    {
      "val": "25",
      "offset": 61
    }
  ],
  "location": "MyTestSteps.user_selects_the_date_as_month_year_and_day_on_fee_entry_page(String,String,String)"
});
formatter.result({
  "duration": 3266847714,
  "status": "passed"
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
  "duration": 93309241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank",
      "offset": 18
    }
  ],
  "location": "MyTestSteps.select_entry_mode_on_fee_entry_form(String)"
});
formatter.result({
  "duration": 86316326,
  "status": "passed"
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
  "duration": 386934536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JULY - AUGUST",
      "offset": 25
    }
  ],
  "location": "MyTestSteps.user_selects_installment_on_fee_entry_form(String)"
});
formatter.result({
  "duration": 520901328,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.click_on_show_of_fee_entry_form()"
});
formatter.result({
  "duration": 1379461000,
  "status": "passed"
});
formatter.match({
  "location": "MyTestSteps.user_verify_fee_details_on_fee_entry_form()"
});
formatter.result({
  "duration": 222248418,
  "status": "passed"
});
formatter.after({
  "duration": 32550,
  "status": "passed"
});
});