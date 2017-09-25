Feature: Gender Religion Wise Student Report
      As a user I would like to open gender religion wise student report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
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
