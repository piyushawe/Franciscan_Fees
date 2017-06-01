Feature: Fee Cheque Bounce Report
     As a user I would like to open fee cheque bounce report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test fee cheque bounce report with different filters
    Then cheque bounce report is opened
    Then user select school"<school>" on cheque bounce report
    Then user select class"<class>" on cheque bounce report
    Then user select section"<section>" on cheque bounce report
    Then user click on show on cheque bounce report

    Examples: 
      | class | school              | section |
      | 1     | Delhi Public School | A       |

  @scenario2
  Scenario Outline: To test fee cheque bounce report with different filters
    Then cheque bounce report is opened
    Then user select date from as month"April" year "2017" and day"1" on cheque bounce report
    Then user select date to as month"May" year "2017" and day"1" on cheque bounce report
    Then user select class"<class>" on cheque bounce report
    Then user select section"<section>" on cheque bounce report
    Then user select bank name"<bank name>" on cheque bounce report
    Then user select the user"eCare Admin" on cheque bounce report
    Then user click on show on cheque bounce report

    Examples: 
      | class | school              | section | bank name    |
      | 1     | Delhi Public School | A       | All Accounts |

  #with no filters
  @scenario3
  Scenario: To test fee cheque bounce report with no filters
    Then cheque bounce report is opened
    Then user select date from as month"April" year "2017" and day"1" on cheque bounce report
    Then user select date to as month"March" year "2018" and day"31" on cheque bounce report
    Then user click on show on cheque bounce report
