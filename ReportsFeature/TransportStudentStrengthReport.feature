Feature: Transport Student Strength Report
      As a user I would like to open transport student strength report
      So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test transport student strength report
    Then transport student strength report is opened
    Then user select class "<class>" on transport student strength report
    Then user select section "<section>" on transport student strength report
    Then user select route "<route>" on transport student strength report
    Then user click show on transport student strength report

    Examples: 
      | class | section | route |
      | 1     | A       | R01   |

  #with no filters
  @scenario2
  Scenario: To test when no filters are selected
    Then transport student strength report is opened
    Then user click show on transport student strength report
