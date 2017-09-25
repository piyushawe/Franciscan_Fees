Feature: Class Wise Student Strength Report
    As a user I would like to open class wise student strength report
    So that I don't have to do it myself

  Background: 
    Given user enters url" http://erptraining.franciscanecare.net/Secure/"
    When enter username"admin" and password"fspl@12345"
    Then signin
    And passes school name "erptraining"
    Then home page is opened

  @scenario1
  Scenario Outline: To test class wise student strength report row wise
    Then class wise student strength page is opened
    Then user click row wise on class wise student strength page
    Then user select class "<class>" on class wise student strength page
    Then user check on new students on class wise student strength page
    Then user click show on class wise student strength page

    Examples: 
      | class |
      |     1 |

  @scenario2
  Scenario Outline: To test class wise student strength report based on column wise
    Then class wise student strength page is opened
    Then user select date wise on class wise student strength page
    Then user select date as month "April" year "2017" and day "10" on class wise student strength page
    Then user click column wise on class wise student strength page
    Then user select class "<class>" on class wise student strength page
    Then user click section wise on class wise student strength page
    Then user select section "<section>" on class wise student strength page
    Then user click show on class wise student strength page

    Examples: 
      | class | section |
      |     1 | A       |

  #without filters
  @scenario3
  Scenario: To test row wise
    Then class wise student strength page is opened
    Then user click row wise on class wise student strength page
    Then user click show on class wise student strength page

  @scenario4
  Scenario: To test column wise
    Then class wise student strength page is opened
    Then user click column wise on class wise student strength page
    Then user click show on class wise student strength page

  @scenario5
  Scenario: To test column wise with date and all sections
    Then class wise student strength page is opened
    Then user select date wise on class wise student strength page
    Then user select date as month "April" year "2017" and day "10" on class wise student strength page
    Then user click column wise on class wise student strength page
    Then user click section wise on class wise student strength page
    Then user click show on class wise student strength page

  @scenario6
  Scenario: To test column wise with date, all sections and new students
    Then class wise student strength page is opened
    Then user select date wise on class wise student strength page
    Then user select date as month "April" year "2017" and day "10" on class wise student strength page
    Then user click column wise on class wise student strength page
    Then user click section wise on class wise student strength page
    Then user check on new students on class wise student strength page
    Then user click show on class wise student strength page

  @scenario7
  Scenario: To test row wise with date and new students
    Then class wise student strength page is opened
    Then user select date wise on class wise student strength page
    Then user select date as month "April" year "2017" and day "10" on class wise student strength page
    Then user click row wise on class wise student strength page
    Then user check on new students on class wise student strength page
    Then user click show on class wise student strength page
