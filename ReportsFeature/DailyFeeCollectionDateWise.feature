Feature: Daily Fee Collection Date Wise Report
     As a user I would like to open daily fee collection date wise report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test daily fee collection date wise report based on different filters
    Then daily fee collection date wise report is opened
    Then user select entry mode "School" on daily fee collection date wise report
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date wise report
    Then user select to date as month "May" year "2017" and day "31" on daily fee collection date wise report
    Then user select class "<class-sec>" on daily fee collection date wise report
    Then user select school "<school>" on daily fee collection date wise report
    Then user select fee type "<fee type>" on daily fee collection date wise report
    Then user select pay mode "Cash" and "Cheque" on daily fee collection date wise report
    Then user select bank name "<bank name>" on daily fee collection date wise report
    Then user click show on daily fee collection date wise report

    Examples: 
      | class-sec | school                         | fee type | bank name    |
      | 1-A       | Convent of Jesus & Mary School | SCHOOL   | All Accounts |

  @scenario2
  Scenario: To test daily fee collection date wise report based on different filters
    Then daily fee collection date wise report is opened
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date wise report
    Then user select to date as month "December" year "2017" and day "31" on daily fee collection date wise report
    Then user select user "eCare Admin" on daily fee collection date wise report
    Then user click show on daily fee collection date wise report

  #with no filter
  @scenario3
  Scenario: To test daily fee collection date wise report with no filters
    Then daily fee collection date wise report is opened
    Then user select from date as month "April" year "2017" and day "1" on daily fee collection date wise report
    Then user select to date as month "March" year "2018" and day "31" on daily fee collection date wise report
    Then user click show on daily fee collection date wise report
