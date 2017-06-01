Feature: Daily Fee Collection Account Wise Report
     As a user I would like to open daily fee collection account wise report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test daily fee collection account wise report based on different filters
    Then daily fee collection account wise report is opened
    Then user select entry mode "School" on daily fee collection account wise report
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection account wise report
    Then user select to date as month "April" year "2017" and day "30" on daily fee collection account wise report
    Then user select class "<class-sec>" on daily fee collection account wise report
    Then user select fee type "<fee type>" on daily fee collection account wise report
    Then user select pay mode "Cash" and "Cheque" on daily fee collection account wise report
    Then user select bank name "<bank name>" on daily fee collection account wise report
    Then user click filter with cheque clearing date on daily fee collection account wise report
    Then user click head wise on daily fee collection account wise report
    Then user click show on daily fee collection account wise report

    Examples: 
      | class-sec | school                         | bank name    | fee type |
      | 1-A       | Convent of Jesus & Mary School | All Accounts | SCHOOL   |

  @scenario2
  Scenario Outline: To test daily fee collection account wise report based on different filters
    Then daily fee collection account wise report is opened
    Then user select fee type "<fee type>" on daily fee collection account wise report
    Then user click filter with cheque clearing date on daily fee collection account wise report
    Then user click receipt no range on daily fee collection account wise report
    Then user enter receipt no from "1" to "10" on daily fee collection account wise report
    Then user click without head total amount on daily fee collection account wise report
    Then user click show on daily fee collection account wise report

    Examples: 
      | fee type |
      | SCHOOL   |

  @scenario3
  Scenario Outline: To test daily fee collection account wise report based on different filters
    Then daily fee collection account wise report is opened
    Then user select fee type "<fee type>" on daily fee collection account wise report
    Then user click filter with cheque clearing date on daily fee collection account wise report
    Then user click with head one line data on daily fee collection account wise report
    Then user select user "eCare Admin" on daily fee collection account wise report
    Then user click show on daily fee collection account wise report

    Examples: 
      | fee type |
      | SCHOOL   |

  @scenario4
  Scenario Outline: To test daily fee collection account wise report based on different filters
    Then daily fee collection account wise report is opened
    Then user select school "<school>" on daily fee collection account wise report
    Then user select fee type "<fee type>" on daily fee collection account wise report
    Then user click filter with cheque clearing date on daily fee collection account wise report
    Then user click without head one line data on daily fee collection account wise report
    Then user select user "eCare Admin" on daily fee collection account wise report
    Then user click show on daily fee collection account wise report

    Examples: 
      | school                         | fee type |
      | Convent of Jesus & Mary School | SCHOOL   |
