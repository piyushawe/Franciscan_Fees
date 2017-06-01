Feature: Monthly Consolidated Report
      As a user I would like to open monthly consolidated report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test monthly consolidated report based on different filters
    Then monthly consolidated report is opened
    Then user select entry mode "School" on monthly consolidated report
    Then user select school "<school>" on monthly consolidated report
    Then user select fee type "<fee type>" on monthly consolidated report
    Then user select class "<class-sec>" on monthly consolidated report
    Then user select installment "<installment>" on monthly consolidated report
    Then user select paymode "Cash" on monthly consolidated report
    Then user select bank name "<bank name>" on monthly consolidated report
    Then user select user "eCare Admin" on monthly consolidated report
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

    Examples: 
      | class-sec | school                         | fee type | installment | bank name    |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       | All Accounts |

  @scenario2
  Scenario Outline: To test monthly consolidated report based on different filters
    Then monthly consolidated report is opened
    Then user select school "<school>" on monthly consolidated report
    Then user select fee type "<fee type>" on monthly consolidated report
    Then select month "Apr" on monthly consolidated report
    Then user select class "<class-sec>" on monthly consolidated report
    Then user select installment "<installment>" on monthly consolidated report
    Then user select paymode "Cash" and "Cheque" on monthly consolidated report
    Then user click filter with cheque clearing date on monthly consolidated report
    Then user click class wise on monthly consolidated report
    Then user click show on monthly consolidated report

    Examples: 
      | class-sec | school                         | fee type | installment |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | APRIL       |

  @scenario3
  Scenario Outline: To test monthly consolidated report based on different filters
    Then monthly consolidated report is opened
    Then user select school "<school>" on monthly consolidated report
    Then user select fee type "<fee type>" on monthly consolidated report
    Then user click filter with cheque clearing date on monthly consolidated report
    Then user click without head total amount on monthly consolidated report
    Then user click show on monthly consolidated report

    Examples: 
      | school                         | fee type |
      | Convent of Jesus & Mary School | SCHOOL   |

  #with no filter
  @scenario4
  Scenario: To test head wise with no filters selected
    Then monthly consolidated report is opened
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

  @scenario5
  Scenario: To test without head with no filters selected
    Then monthly consolidated report is opened
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

  @scenario6
  Scenario: To test class wise with no filters selected
    Then monthly consolidated report is opened
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

  #with no filter and cheque clearing date
  @scenario7
  Scenario: To test head wise and cheque clearing date with no filters selected
    Then monthly consolidated report is opened
    Then user click filter with cheque clearing date on monthly consolidated report
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

  @scenario8
  Scenario: To test without head and cheque clearing date with no filters selected
    Then monthly consolidated report is opened
    Then user click filter with cheque clearing date on monthly consolidated report
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report

  @scenario9
  Scenario: To test class wise and cheque clearing date with no filters selected
    Then monthly consolidated report is opened
    Then user click filter with cheque clearing date on monthly consolidated report
    Then user click head wise on monthly consolidated report
    Then user click show on monthly consolidated report
