Feature: Refund Amount Report
      As a user I would like to open refund amount report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erp.stkarenssecondaryschool.com"
    When enter username"admin" and password"stkss#54321techpass"
    Then signin
    And passes school name "st karen"
    Then home page is opened

  @scenario1
  Scenario Outline: To test refund amount report on the basis of year
    Then refund amount page is opened
    Then user select year as "<year>" on refund amount page
    Then user click on show on refund amount page

    Examples: 
      | year      |
      | 2016-2017 |

  @scenario2
  Scenario Outline: To test refund amount report on the basis of date and year
    Then refund amount page is opened
    Then user select from date as month "April" year"2017" and day "1" on refund amount page
    Then user select to date as month "May" year"2017" and day "31"on refund amount page
    Then user select year as "<year>" on refund amount page
    Then user click on show on refund amount page

    Examples: 
      | year      |
      | 2016-2017 |

  #with no filter
  @scenario3
  Scenario: To test for all the years
    Then refund amount page is opened
    Then user click on show on refund amount page
