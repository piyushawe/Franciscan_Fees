Feature: Amount Without Structure Report
    As a user I would like to open amount without structure report
    So that I don't have to do it myself

  Background: 
    Given user enters url"http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test amount without structure report with different filters
    Then amount without structure report is opened
    Then user select date from as month "April" year "2017" and day "1" on amount without structure report
    Then user select date to as month "December" year "2018" and day "30" on amount without structure report
    Then user select class "<class>" on amount without structure report
    Then user select section "<section>" on amount without structure report
    Then user select school "<school>" on amount without structure report
    Then user select year "<year>" on amount without structure report
    Then user click cancel fee on amount without structure report
    Then user click show on amount without structure report

    Examples: 
      | class | section | school              | year      |
      | 1     | A       | Delhi Public School | 2016-2017 |

  #with no filters
  @scenario2
  Scenario: To test when no filter is selected
    Then amount without structure report is opened
    Then user select date from as month "April" year "2017" and day "1" on amount without structure report
    Then user select date to as month "March" year "2018" and day "31" on amount without structure report
    Then user click show on amount without structure report

  @scenario3
  Scenario: To test when no filter is selected with cancel fee
    Then amount without structure report is opened
    Then user select date from as month "April" year "2017" and day "1" on amount without structure report
    Then user select date to as month "March" year "2018" and day "31" on amount without structure report
    Then user click cancel fee on amount without structure report
    Then user click show on amount without structure report
