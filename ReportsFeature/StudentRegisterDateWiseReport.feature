Feature: Student Register Date Wise Report
      As a user I would like to open student register date wise report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test student register date wise report based on filters
    Then student register date wise report page is opened
    Then user select from date as month "April" year "2017" and day"5" on student register date wise report
    Then user select to date as month "May" year "2017" and day"15" on student register date wise report
    Then user select class "<class>" on student register date wise report
    Then user select section "<section>" on student register date wise report
    Then user click show on student register date wise report

    Examples: 
      | class | section |
      | 1     | A       |

  #with no filter
  @scenario2
  Scenario: To test student register date wise report with no filter
    Then student register date wise report page is opened
    Then user select from date as month "April" year "2017" and day"1" on student register date wise report
    Then user select to date as month "March" year "2018" and day"31" on student register date wise report
    Then user click show on student register date wise report
