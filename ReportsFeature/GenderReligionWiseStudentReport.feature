Feature: Gender Religion Wise Student Report
      As a user I would like to open gender religion wise student report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://192.168.10.101:8069/Modules.aspx"
    When enter username"admin" and password"admin@123"
    Then signin
    And passes school name "rosary"
    Then home page is opened

  @scenario1
  Scenario Outline: To test gender religion wise student report based on different filters
    Then gender religion wise student report page is opened
    Then user select religion"<religion>" on gender religion wise student report page
    Then user select class "<class>" on gender religion wise student report page
    Then user select section "<section>" on gender religion wise student report page
    Then user select gender"<gender>" on gender religion wise student report page
    Then user click show on gender religion wise student report page

    Examples: 
      | class | section | religion | gender |
      | 1     | A       | HINDU    | Male   |

  #with no filter
  @scenario2
  Scenario: To test gender religion wise student report based on different filters
    Then gender religion wise student report page is opened
    Then user click show on gender religion wise student report page
