Feature: Active Inactive Students Detail Report
   As a user 
   I would like to open active inactive students detail report
   So that I don't have to open myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test active inactive students detail report based on the filters
    Then active inactive students detail report is opened
    Then user select class "<class>" on active inactive students detail report page
    Then user select section "<section>" on active inactive students detail report page
    Then user select from date as month "April" year "2017" and day"1" on active inactive students detail report page
    Then user select till date as month "May" year "2017" and day"30" on active inactive students detail report page
    Then user click active on active inactive students detail report page
    Then user click show on active inactive students detail report page

    Examples: 
      | class | section |
      |     1 | A       |

  @scenario2
  Scenario: To test active inactive students detail report based on the filters
    Then active inactive students detail report is opened
    Then user select user "eCare Admin" on active inactive students detail report is opened
    Then user select from date as month "April" year "2017" and day"1" on active inactive students detail report page
    Then user select till date as month "November" year "2017" and day"30" on active inactive students detail report page
    Then user click inactive on active inactive students detail report page
    Then user click show on active inactive students detail report page

  #with no filters
  @scenario3
  Scenario: To test when active is clicked
    Then active inactive students detail report is opened
    Then user select from date as month "April" year "2017" and day"1" on active inactive students detail report page
    Then user select till date as month "March" year "2018" and day"31" on active inactive students detail report page
    Then user click active on active inactive students detail report page
    Then user click show on active inactive students detail report page

  @scenario4
  Scenario: To test when inactive is clicked
    Then active inactive students detail report is opened
    Then user select from date as month "April" year "2017" and day"1" on active inactive students detail report page
    Then user select till date as month "March" year "2018" and day"31" on active inactive students detail report page
    Then user click inactive on active inactive students detail report page
    Then user click show on active inactive students detail report page
