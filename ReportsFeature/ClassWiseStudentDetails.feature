Feature: Class Wise Student Details Report
     As a user I would like to open lass wise student details report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test class wise student details report
    Then class wise student details report is opened
    Then user select school "<school>" on class wise student details
    Then user select class "<class>" on class wise student details
    Then user select section "<section>" on class wise student details
    Then user click on show on class wise student details

    Examples: 
      | class | section | school              |
      | 1     | A       | Delhi Public School |

  @scenario2
  Scenario Outline: To test class wise student details report when the student is day scholar/boarding
    Then class wise student details report is opened
    Then user select school "<school>" on class wise student details
    Then user select class "<class>" on class wise student details
    Then user select section "<section>" on class wise student details
    Then user click is day scholar boarding show on report on class wise student details
    Then user click on show on class wise student details

    Examples: 
      | class | section | school              |
      | 1     | A       | Delhi Public School |
