Feature: Student Strength Ratio Wise Report
      As a user I would like to open student strength ratio wise report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test student strength ratio wise report on different filters
    Then student strength ratio wise report is opened
    Then user select class "<class>" on student strength ratio wise report
    Then user select section "<section>" on student strength ratio wise report
    Then user click show on student strength ratio wise report

    Examples: 
      | class | section |
      | 1     | A       |

  @scenario2
  Scenario Outline: To test student strength ratio wise report when new old student status is selected
    Then student strength ratio wise report is opened
    Then user select class "<class>" on student strength ratio wise report
    Then user select date to as month "April" year "2017" and day "30"on student strength ratio wise report
    Then user click details with new old student status on student strength ratio wise report
    Then user click show on student strength ratio wise report

    Examples: 
      | class | section |
      | 1     | A       |

  #with no filter
  @scenario3
  Scenario: To test student strength ratio wise report when no filter is selected
    Then student strength ratio wise report is opened
    Then user click show on student strength ratio wise report

  @scenario4
  Scenario: To test student strength ratio wise report when no filter is selected with old student status
    Then student strength ratio wise report is opened
    Then user click details with new old student status on student strength ratio wise report
    Then user click show on student strength ratio wise report
