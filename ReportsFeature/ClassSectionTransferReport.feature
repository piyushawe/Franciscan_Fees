Feature: Class Section Transfer Report
    As a user I would like to open calss section transfer report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test class section transfer report
    Then class section transfer report is opened
    Then user select class "<class>" on class section transfer report
    Then user select section "<section>" on class section transfer report
    Then user select old academic year "<academic year>" on class section transfer report
    Then user select old financial year "<financial year>" on class section transfer report
    Then user click on show on class section transfer report

    Examples: 
      | class | section | academic year | financial year |
      | 1     | A       | 2016-2017     | 2016-2017      |
