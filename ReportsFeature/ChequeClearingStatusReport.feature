Feature: Cheque Clearing Status Report
    As a user I would like to open cheque clearing status report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To verify cheque clearing status report head wise based on different filters
    Then cheque clearing status report is opened
    Then user select entry mode "School" on cheque clearing status report
    Then user select from date as month"April" year "2017" and day"1" on cheque clearing status report
    Then user select to date as month"April" year "2017" and day"30" on cheque clearing status report
    Then user select class"<class-sec>" on cheque clearing status report
    Then user select fee type "<fee type>" on cheque clearing status report
    Then user select bank name "<bank name>" on cheque clearing status report
    Then user click head wise on cheque clearing status report
    Then user select clearing status "Cleared" on cheque clearing status report
    Then user click show on cheque clearing status report

    Examples: 
      | class-sec | bank name    | fee type |
      | 1-A       | All Accounts | SCHOOL   |

  @scenario2
  Scenario Outline: To verify cheque clearing status report without head based on different filters
    Then cheque clearing status report is opened
    Then user select from date as month"April" year "2017" and day"1" on cheque clearing status report
    Then user select to date as month"April" year "2017" and day"30" on cheque clearing status report
    Then user select fee type "<fee type>" on cheque clearing status report
    Then user click receipt number range on cheque clearing status report
    Then user enter receipt from "9880" and receipt to "9910" on cheque clearing status report
    Then user click without head total amount on cheque clearing status report
    Then user click show on cheque clearing status report

    Examples: 
      | fee type |
      | SCHOOL   |

  #with no filters
  @scenario3
  Scenario: To verify head wise when no filters are selected
    Then cheque clearing status report is opened
    Then user select from date as month"April" year "2017" and day"1" on cheque clearing status report
    Then user select to date as month"March" year "2018" and day"31" on cheque clearing status report
    Then user click head wise on cheque clearing status report
    Then user click show on cheque clearing status report

  @scenario4
  Scenario: To verify without head when no filters are selected
    Then cheque clearing status report is opened
    Then user select from date as month"April" year "2017" and day"1" on cheque clearing status report
    Then user select to date as month"March" year "2018" and day"31" on cheque clearing status report
    Then user click without head total amount on cheque clearing status report
    Then user click show on cheque clearing status report
