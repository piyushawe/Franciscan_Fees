Feature: Month Wise Collection Report
      As a user I would like to open fees student ledger
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test month wise collection report based on different filters
    Then month wise collection report is opened
    Then user select entry mode "<entry mode>" on month wise collection report
    Then select class "<class>" on month wise collection report
    Then user select installment "<installment>" on month wise collection report
    Then user click show on month wise collection report

    Examples: 
      | class | installment | entry mode |
      |   1-A | APRIL       | School     |

  @scenario2
  Scenario Outline: To test month wise collection report based on different filters
    Then month wise collection report is opened
    Then user select entry mode "<entry mode>" on month wise collection report
    Then user select fee type "<fee type>" on month wise collection report
    Then user select month "Apr" on month wise collection report
    Then select class "<class>" on month wise collection report
    Then user select installment "<installment>" on month wise collection report
    Then user select bank name "<bank name>" on month wise collection report
    Then select user "eCare Admin" on month wise collection report
    Then user click show on month wise collection report

    Examples: 
      | class | fee type | installment | bank name   | entry mode |
      |   1-A | SCHOOL   | APRIL       | Rest of All | School     |

  #with no filters
  @scenario3
  Scenario Outline: To test month wise collection report with no filters
    Then month wise collection report is opened
    Then user select installment "<installment>" on month wise collection report
    Then user click show on month wise collection report

    Examples: 
      | class | installment |
      |   1-A | APRIL       |
