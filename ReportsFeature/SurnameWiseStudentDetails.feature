Feature: Surname Wise Student Details
      As a user I would like to open surname wise student details report
      So that I don't have to do it myself

  Background: 
    Given user enters url"http://qaerp.franciscanecare.net"
    When enter username"admin" and password"Admin#franciscan"
    Then signin
    And passes school name "qaerp"
    Then home page is opened

  @scenario1
  Scenario Outline: To test surname wise student details with different filters
    Then surname wise student details report is opened
    Then user select class "<class>" on surname wise student details report
    Then user select section "<section>" on surname wise student details report
    Then user select admission no"AdmissionNo" and class"Class" in student on surname wise student details report
    Then user click show on surname wise student details report

    Examples: 
      | class | section |
      |     1 | A       |

  #with no filter
  @scenario2
  Scenario Outline: To test surname wise student details with no filter
    Then surname wise student details report is opened
    Then user select class "<class>" on surname wise student details report
    Then user select section "<section>" on surname wise student details report
    Then user click show on surname wise student details report

    Examples: 
      | class | section |
      |     1 | A       |
