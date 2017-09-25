Feature: Date Wise Admission Report
     As a user I would like to open date wise admission report
     So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test date wise admission report
    Then date wise admission report page is opened
    Then user select from date as month"April" year"2017" and day "1" on admission report page
    Then user select to date as month"July" year"2017" and day "31" on admission report page
    Then user select class"<class>" on admission report page
    Then user select section"<section>" on admission report page
    Then user click show on admission report page

    Examples: 
      | class | section |
      |     1 | A       |

  #with no filter
  @scenario2
  Scenario: To test date wise admission report when no filter is selected
    Then date wise admission report page is opened
    Then user select from date as month"April" year"2017" and day "1" on admission report page
    Then user select to date as month"March" year"2018" and day "31" on admission report page
    Then user click show on admission report page
