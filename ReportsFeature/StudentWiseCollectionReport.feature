Feature: Student Wise Collection Report
      As a user I would like to open student wise collection report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test student wise collection report with different filters
    Then student wise collection report is opened
    Then user select class"<class>" on student wise collection report
    Then user select section"<section>" on student wise collection report
    Then user click on show on student wise collection report

    Examples: 
      | class | section |
      |     1 | A       |

  @scenario2
  Scenario Outline: To test student wise collection report with all filters
    Then student wise collection report is opened
    Then user select class"<class>" on student wise collection report
    Then user select section"<section>" on student wise collection report
    Then user fee type"<fee type>" on student wise collection report
    Then user select school"<school>" on student wise collection report
    Then user click on show on student wise collection report

    Examples: 
      | class | section | fee type | school                         |
      |     1 | A       | SCHOOL   | Convent of Jesus & Mary School |

  #with no filter
  @scenario3
  Scenario: To test when no filter is selected
    Then student wise collection report is opened
    Then user click on show on student wise collection report
