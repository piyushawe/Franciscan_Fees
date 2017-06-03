Feature: Total Collection Report
      As a user I would like to open total collection report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test total collection report with different filters
    Then total collection report is opened
    Then user select class"<class>" on total collection report
    Then user select section"<section>" on total collection report
    Then user select installment"<installment>" on total collection report
    Then user click on show on total collection report

    Examples: 
      | class | section | installment |
      |     1 | A       | APRIL       |

  @scenario2
  Scenario Outline: To test total collection report with different filters
    Then total collection report is opened
    Then user select school"<school>" on total collection report
    Then user select class"<class>" on total collection report
    Then user select section"<section>" on total collection report
    Then user select fee type"<fee type>" on total collection report
    Then user select installment"<installment>" on total collection report
    Then user click on show on total collection report

    Examples: 
      | class | section | school                         | fee type | installment |
      |     1 | A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  @scenario3
  Scenario Outline: To test total collection report with different filters
    Then total collection report is opened
    Then user select school"<school>" on total collection report
    Then user select class"<class>" on total collection report
    Then user select section"<section>" on total collection report
    Then user select fee type"<fee type>" on total collection report
    Then user select installment"<installment>" on total collection report
    Then user select user"eCare Admin" on total collection report
    Then user click on show on total collection report

    Examples: 
      | class | section | school                         | fee type | installment |
      |     1 | A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  #with no filter
  @scenario4
  Scenario: To test total collection report when no filter is selected
    Then total collection report is opened
    Then user click on show on total collection report
